import static java.lang.Integer.*;

public class MinMaxAverageOfArrays {
    public static void main(String[] args) {

        int[] array = {13, 20, 14, 5, 2, 8};
        int min = MAX_VALUE;
        int max = MIN_VALUE;
        float average = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min)
                min = array[i];

            if (array[i] > max)
                max = array[i];

            average+=array[i];
        }
        average=(float)average/array.length;

    System.out.println("Max: "+ max);
    System.out.println("Min: "+ min);
    System.out.println("Average: "+average);
    }
}
