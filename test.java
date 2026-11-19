import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("type a number");
        System.out.print(">>");
        float input = Float.parseFloat(myScanner.nextLine());
        System.out.println(input);
        System.out.println(ScientificCalculator.toSciNot(input, 3));
        myScanner.close();
    }
}
