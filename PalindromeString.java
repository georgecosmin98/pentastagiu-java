public class PalindromeString {

    public static void main(String[] args) {
        boolean isPalindrome = true;
        String text = "aaabccbaaa";
        char[] textChar = text.toCharArray();
        int textCharLength = textChar.length - 1;
        int i = 0;

        while (i < textCharLength)
            if (textChar[i++] != textChar[textCharLength--]) {
                isPalindrome = false;
                break;
            }

        if (isPalindrome)
            System.out.println("True");
        else
            System.out.println("False");
    }
}
