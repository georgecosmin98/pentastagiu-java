package MessagesOnBoard;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Board {
    ArrayList<Message> messageList;

    public Board(ArrayList<Message> messageList) {
        this.messageList = messageList;
    }

    public Board() {
        messageList = new ArrayList<Message>(1);
    }

    void addMessage(Message message) {
        messageList.add(message);
    }

    void printMessageList() {
        for (Message m : messageList)
            System.out.println(m);
    }

    void printTheMessagesOfAPerson(User user) {
        boolean userExist = false;
        for (Message m : messageList) {
            if (m.user.equals(user)) {
                System.out.println(m);
                userExist = true;
            }}
            if(userExist==false)
            System.out.println("Nu a fost gasit userul in baza de date!");

    }

    @Override
    public String toString() {
        return "Board{" +
                "messageList=" + messageList +
                '}';
    }
}
