import java.util.Scanner;

public class Calculator{
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("What mode do you want (N)ormal or (S)cientific:");
        char mode = myScanner.next().charAt(0);
        System.out.println("Operation? (A)ddition, (S)ubtraction, (M)ultiplication, or (D)ivision:");
        char op = myScanner.next().charAt(0);
        System.out.println("First number?");
        double firstNumber = myScanner.nextDouble();
        System.out.print("Second number?");
        double secondNumber = myScanner.nextDouble();
        if (mode == 'N') {
            System.out.println(StandardCalculator.calculate(firstNumber, secondNumber, op));
        }
    }
}