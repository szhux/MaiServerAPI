package models;

/**
 * Created by szhuk on 20.02.2018.
 */
public class Message {
    private Long uid;
    private String sender;
    private String subject;
    private String message;
    private Long time_sent;
    private Boolean is_read;
    private Boolean archived;

    public Boolean getIs_read() {
        return is_read;
    }

    public void setIs_read(Boolean is_read) {
        this.is_read = is_read;
    }

    public Boolean getArchived() {
        return archived;
    }

    public void setArchived(Boolean archived) {
        this.archived = archived;
    }


    public Message(Long uid, String sender, String subject, String message, Long time_sent, Boolean is_read, Boolean archived) {
        this.uid = uid;
        this.sender = sender;
        this.subject = subject;
        this.message = message;
        this.time_sent = time_sent;
        if (this.archived = null) {
            this.archived = false;
        } else {
            this.archived = archived;
        }

        if (this.is_read = null) {
            this.is_read = false;
        } else {
            this.is_read = is_read;
        }
    }

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Long getTimeSent() {
        return time_sent;
    }

    public void setTimeSent(Long time_sent) {
        this.time_sent = time_sent;
    }

//    //this class was used for
//    @Override
//    public String toString() {
//        return "Message{" +
//                "uid=" + uid +
//                ", sender='" + sender + '\'' +
//                ", subject='" + subject + '\'' +
//                ", message='" + message + '\'' +
//                ", time_sent=" + time_sent +
//                ", is_read=" + is_read +
//                ", archived=" + archived +
//                '}';
//    }
}
