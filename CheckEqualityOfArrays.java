public class CheckEqualityOfArrays {

    public static void main(String[] args) {
        int[] firstArray = {1, 2, 3, 4};
        int[] secondArray = {1, 2, 3, 4};
        boolean equality = true;
        if (firstArray.length == secondArray.length) {
            for (int i = 0; i < firstArray.length; i++)
                if (firstArray[i] != secondArray[i]) {
                    equality = false;
                    System.out.println("False");
                    break;
                }
            if (equality)
                System.out.println("True");
        } else
            System.out.println("False");
    }
}
