public class StringContainString {

    public static void main(String[] args) {
        String baseString = "Hello java world";
        String targetString = "java";

        if (baseString.contains(targetString))
            System.out.println("True");
        else
            System.out.println("False");
    }
}
