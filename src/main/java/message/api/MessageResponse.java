package message.api;


public class MessageResponse {

    private int counts;
    private String message;

    public MessageResponse() {
    }

    public MessageResponse(int counts, String message) {
        this.counts = counts;
        this.message = message;
    }

    public int getCounts() {
        return counts;
    }

    public void setCounts(int counts) {
        this.counts = counts;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
