public class FirstXFibonacciNumber {
    public static void main(String[] args) {

        int firstFibo = 1;
        int secondFibo = 1;
        int aux = 0;
        int x = 20;
        float average = 2;

        System.out.print(firstFibo + " " + secondFibo);

        for (int i = 1; i <= x - 2; i++) {
            aux = firstFibo;
            firstFibo = secondFibo;
            secondFibo = aux + secondFibo;
            average += secondFibo;
            System.out.print(" " + secondFibo);
        }

        average = (float) average / x;

        System.out.println("\n" + average);
    }
}
