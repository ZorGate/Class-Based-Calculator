public class ScientificCalculator {
    public static String calculate(int num1, int num2, char mode) {
        return toSciNot(StandardCalculator.calculate(num1, num2, mode));
    }
    public static String toSciNot(int stdNum) {
        String numAsString = String.valueOf(stdNum);
        int length = numAsString.length();
        boolean done = false;
        int i = 0;
        while (done = false) {
            if (numAsString.charAt(i) != '0' || numAsString.charAt(i) != '.') {
                done = true;
                int power = i;
            } else {
                i++;
            }
        }
    }
}