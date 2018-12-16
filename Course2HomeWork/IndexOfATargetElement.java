public class IndexOfATargetElement {

    public static void main(String[] args) {
        int[] array = {13, 20, 14, 5, 2, 8};
        int targetElement = 5;
        for (int i = 0; i < array.length; i++)
            if (array[i] == targetElement)
                System.out.println("Target element: " + targetElement + " is located at index: " + i + " in the array.");

    }
}
