package fit.wenchao.lanchat.model.chat;

public class Message {
    String contentType;
    String business;
    String from;
    String target;
    Object content;

    public Message() {
    }

    public Message(String contentType, String business, String from, String target, Object content) {
        this.contentType = contentType;
        this.business = business;
        this.from = from;
        this.target = target;
        this.content = content;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public String getBusiness() {
        return business;
    }

    public void setBusiness(String business) {
        this.business = business;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public Object getContent() {
        return content;
    }

    public void setContent(Object content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Message [contentType=" + contentType + ", business=" + business + ", from=" + from + ", target="
                + target + ", content=" + content + "]";
    }

}
