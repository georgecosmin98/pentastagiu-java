package MessagesOnBoard;

public class Message {
    User user;
    String description;
    String text;

    public Message(User user, String description, String text) {
        this.user = user;
        this.description = description;
        this.text = text;
    }

    @Override
    public String toString() {
        return user + "\nDescription: " + description + "\n" + "Text:\n\t " + text + "\n";
    }
}
