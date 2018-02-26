package models;

import java.util.List;

/**
 * Created by szhuk on 20.02.2018.
 */
public class ListOfMessages {
    private List<Message> messages;
    public List<Message> getMessages(){
        return messages;
    }
    public void setMessages(List<Message> input){
        this.messages = input;
    }

    public int size() {
        return messages.size();
    }

    public void createListWithArchivedMessages() {
        for (int i = 0; i < size(); i++) {
            try {
                if (!getMessages().get(i).getArchived()) {
                    getMessages().remove(i);
                    i--;
                }
            } catch (NullPointerException npe) {
                getMessages().remove(i);
                i--;
            }
        }
    }

    public void createListWithReadMessages() {
        for (int i = 0; i < size(); i++) {
            try {
                if (!getMessages().get(i).getIs_read()) {
                    getMessages().remove(i);
                    i--;
                }
            } catch (NullPointerException npe) {
                getMessages().remove(i);
                i--;
            }
        }
    }
}
