import java.util.Arrays;

public class IndexOfEachLetter {
    public static void main(String[] args)
    {
        String text="abcd";
        int[] index=new int [text.length()];
        char[] textChar=text.toCharArray();
        for(int i=0;i<textChar.length;i++)
            index[i]=textChar[i]-97;

        System.out.print(Arrays.toString(index));

    }
}
