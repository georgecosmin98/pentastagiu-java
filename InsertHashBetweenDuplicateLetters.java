public class InsertHashBetweenDuplicateLetters {
    public static void main(String[] args) {
        String text = "Hello world";
        char[] textChar = text.toCharArray();
        StringBuilder finalText = new StringBuilder();
        int indexStringBuilder = 0;
        for (int i = 0; i < textChar.length; i++)
            if (i < textChar.length - 1) {
                if (textChar[i] == textChar[i + 1]) {
                    finalText.insert(indexStringBuilder++, textChar[i]);
                    finalText.insert(indexStringBuilder++, '#');
                } else
                    finalText.insert(indexStringBuilder++, textChar[i]);
            } else
                finalText.insert(indexStringBuilder++, textChar[i]);
        System.out.println(finalText);

    }
}