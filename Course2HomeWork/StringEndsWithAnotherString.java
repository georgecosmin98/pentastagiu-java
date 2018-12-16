public class StringEndsWithAnotherString {

    public static void main(String[] args) {

        String baseString = "Hello java world";
        String targetString = "orld";

        if (baseString.endsWith(targetString))
            System.out.println("True");
        else
            System.out.println("False");
    }
}
