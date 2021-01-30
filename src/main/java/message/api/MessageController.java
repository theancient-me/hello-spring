package message.api;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController()
public class MessageController {
    List<String> messageStore = new ArrayList<>();
    List<MessageResponse> messageCount = new ArrayList<>();
    public MessageController(){
    }
    
    @GetMapping("/message")
    public List<MessageResponse> getMessage(){
        return messageCount;
    }
    @PostMapping("/message")
    public ResponseEntity<Message> postMessage(@RequestBody Message message){
        if(!messageStore.contains(message.getText())){
            messageStore.add(message.getText());
            messageCount.add(new MessageResponse(1,message.getText()));
        }else{
            int indexOfMessage =  messageStore.indexOf(message.getText());
            messageCount.set(indexOfMessage,new MessageResponse(messageCount.get(indexOfMessage).getCounts()+1,message.getText()));
        }
        return ResponseEntity.ok().body(message);
    }
}
