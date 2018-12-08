public class Concatenate2Arrays {

    public static void main(String[] args) {
        int[] firstArray = {1, 2, 3, 4};
        int[] secondArray = {5, 6, 7, 8};
        int[] concatenateArray = new int[firstArray.length + secondArray.length];
        System.arraycopy(firstArray, 0, concatenateArray, 0, firstArray.length);
        System.arraycopy(secondArray, 0, concatenateArray, firstArray.length, secondArray.length);

        System.out.print("[");
        for (int i = 0; i < concatenateArray.length - 1; i++)
            System.out.print(concatenateArray[i] + ",");
        System.out.print(concatenateArray[concatenateArray.length - 1] + "]");
    }
}
