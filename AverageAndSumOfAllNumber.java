public class AverageAndSumOfAllNumber {

    public static void main(String[] args) {


        int sum = 0;
        int startOfRange = 1;
        int endOfRange = 100;

        for (int i = startOfRange; i <= endOfRange; i++)
            sum += i;

        System.out.println("Sum of all element between [" + startOfRange + "," + endOfRange + "] is : " + sum);

        float average = (float) (startOfRange + endOfRange) / 2;

        System.out.println("Average for range [" + startOfRange + "," + endOfRange + "] is: " + average);
    }
}
