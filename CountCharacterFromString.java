public class CountCharacterFromString {

    public static void main(String[] args) {

        String textString = "Hello java world";
        char[] textChar = textString.toCharArray();
        char targetChar = 'a';
        int charCounter = 0;
        for (int i = 0; i < textChar.length; i++)
            if (textChar[i] == targetChar)
                charCounter++;

        System.out.println(charCounter);
    }
}
