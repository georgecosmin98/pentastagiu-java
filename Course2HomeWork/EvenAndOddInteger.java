public class EvenAndOddInteger {

    public static void main(String[] args)
    {
        int[] array={13,20,14,5,2,8};
        int oddCounter=0;
        int evenCounter=0;
        for(int i=0;i<array.length;i++)
            if(array[i]%2==0)
                evenCounter++;
            else
                oddCounter++;

            System.out.println("Odd elements count: "+oddCounter);
            System.out.println("Even elements count: "+evenCounter);
    }
}
