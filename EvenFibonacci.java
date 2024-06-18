
public class EvenFibonacci {

    public static void main(String[] args) {
        int limit = 4000; // Specify the limit up to which you want the Fibonacci series
        printEvenFibonacciTerms(limit);
    }

    public static void printEvenFibonacciTerms(int limit) {
        int a = 0, b = 1, nextTerm;

        System.out.println("Even terms in the Fibonacci series up to " + limit + " are:");

        while (true) {
            nextTerm = a + b;
            if (nextTerm > limit) {
                break;
            }
            if (nextTerm % 2 == 0) {
                System.out.print(nextTerm + " ");
            }
            a = b;
            b = nextTerm;
        }
    }
}
