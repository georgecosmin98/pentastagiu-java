public class TestArrayLastElement {

    public static void main(String[] args) {
        int[] firstArray = {13, 6, 2, 8, 2, 3};
        int[] secondArray = {13, 6, 2, 8, 2, 13};

        System.out.println("First array have same first and last element?");

        if (firstArray[0] == firstArray[firstArray.length - 1])
            System.out.println("Yes");
        else
            System.out.println("No");

        System.out.println("\nSecond array have same first and last element?");

        if (secondArray[0] == secondArray[secondArray.length - 1])
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
