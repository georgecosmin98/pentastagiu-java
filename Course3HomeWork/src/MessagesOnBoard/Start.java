package MessagesOnBoard;

public class Start {

    public static void main(String[] args) {
        User firstUser = new User("Ilinca", "ilinca@yahoo.com");
        Message firstMessage = new Message(firstUser, "Motivational quotes", "Opportunities don’t happen, you create them!");
        Board board = new Board();
        board.addMessage(firstMessage);

        User secondUser = new User("John", "john183@gmail.com");
        Message secondMessage = new Message(secondUser, "TechNews", "Samsung is working on a Night Sight response called Bright Night.");
        board.addMessage(secondMessage);

        User thirdPerson = new User("Jeffrey", "jeff@gmail.com");
        Message thirdMessage = new Message(secondUser, "Thomas Alva Edison", "Was an American inventor and businessman, who has been described as America's greatest inventor.");
        board.addMessage(thirdMessage);

        User fourthPerson = new User("Emily", "Emm@gmail.com");
        Message fourthMessage = new Message(secondUser, "Hardware", "The term hardware covers all of those parts of a computer that are tangible physical objects.");
        board.addMessage(thirdMessage);

        board.printMessageList();
    }
}
