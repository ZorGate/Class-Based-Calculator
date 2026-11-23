public class Main {
    public static float calculate(float num1, float num2, char op) {
        if (op == 'A') {
            return num1 + num2;
        } else if (op == 'S') {
            return num1 - num2;
        } else if (op == 'M') {
            return num1 * num2;
        } else if (op == 'D') {
            return num1 / num2;
        } else {
            return 0;
        }
    }
}