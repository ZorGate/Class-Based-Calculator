public class Main {
    public static double calculate(double num1, double num2, char mode) {
        if (mode == 'A') {
            return num1 + num2;
        } else if (mode == 'S') {
            return num1 - num2;
        } else if (mode == 'M') {
            return num1 * num2;
        } else if (mode == 'D') {
            return num1 / num2;
        } else {
            return 0;
        }
    }
}