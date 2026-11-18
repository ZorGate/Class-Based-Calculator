import java.rmi.StubNotFoundException;

public class ScientificCalculator {
    public static String calculate(int num1, int num2, char mode) {
        return toSciNot(StandardCalculator.calculate(num1, num2, mode));
    }
    public static String toSciNot(float stdNum) {
        String numString = String.format("%6.3e", stdNum);
        int plusPos = numString.indexOf("+");
        String expValue = numString.substring(plusPos+1);
        /*while (numString.charAt(plusPos+1) == '0') {
            expValue = expValue.substring(1);
        }*/
        return numString.replace("e+"," * 10^");
    }
}