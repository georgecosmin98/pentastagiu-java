package MessagesOnBoard;

public class Start {

    public static void main(String[] args) {
        User user = new User("Ilinca", "ilinca@yahoo.com");
        Message message = new Message(user, "Adaptarea nevoilor ","Omul are nevoie de x,y,z .....");
        Board board = new Board();
        board.addMessage(message);
        board.addMessage(message);
        User user1 = new User("Ilinca", "ilinca@yahoo.com");
        board.printTheMessagesOfAPerson(user1);

        //board.printMessageList();
    }
}
