public class ScientificCalculator {
    public static String calculate(float num1, float num2, char mode, int sigFigs) {
        return toSciNot(StandardCalculator.calculate(num1, num2, mode), sigFigs);
    }
    public static String toSciNot(float stdNum, int sigFigs) {
        String numString = String.format("%6."+sigFigs+"e", stdNum);
        int ePos = numString.indexOf("e");
        String withZeroes;
        if (numString.charAt(ePos+1) == '+') {
            withZeroes = numString.replace("e+"," * 10^");
        } else if (numString.charAt(ePos+1) == '-') {
            withZeroes = numString.replace("e-", "* 10^");
        } else {
            withZeroes = numString;
        }
        return withZeroes.substring(0,ePos-1) + withZeroes.substring(ePos);
    }
}