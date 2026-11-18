public class ScientificCalculator {
    public static String calculate(int num1, int num2, char mode) {
        return toSciNot(StandardCalculator.calculate(num1, num2, mode));
    }
    public static String toSciNot(float stdNum) {
        String numAsString = String.valueOf(stdNum);
        float length = numAsString.length() - 1;
        boolean startFound = false;
        float decPos = numAsString.indexOf(".");
        numAsString = numAsString.replace(".", "");
        System.out.println("before format: " + numAsString); //remove later
        while (numAsString.charAt(0) == '0') {
            numAsString = numAsString.substring(1);
        }
        System.out.println("after format: " + numAsString);
        String endVal = numAsString.substring(0,1) + "." + numAsString.substring(1);
        return endVal; 
    }
}