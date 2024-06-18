public class numberOfSteps {
    public static void main(String[] args) {
        int num = 14;
        System.out.println("Number of steps: " + getStepsToZero(num));
    }

    public static int getStepsToZero(int num) {
        int steps = 0;
        while (num > 0) {
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num--;
            }
            steps++;
        }
        return steps;
    }
}