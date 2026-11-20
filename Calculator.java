import java.util.Scanner;

public class Calculator{
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        char mode = 0;
        char op = 0;
        float firstNumber;
        float secondNumber;
        while (true) {
                System.out.println("What mode do you want (N)ormal or (S)cientific:");
                System.out.print(">>");
                mode = myScanner.next().charAt(0);
            if (mode == 'S' || mode == 'N') {
                break;
            } else {
                System.out.println("err: invalid input, please try again");
            }
        }
        while (true) {
            System.out.println("Operation? (A)ddition, (S)ubtraction, (M)ultiplication, or (D)ivision:");
            System.out.print(">>");
            op = myScanner.next().charAt(0);
            if (op == 'A' || op == 'S' || op == 'M' || op == 'D') {
                break;
            } else {
                System.out.println("err: invalid input, please try again");
            }
        }
        System.out.println("First number?");
        System.out.print(">>");
        firstNumber = myScanner.nextFloat();
        while (true) {
            System.out.println("Second number?");
            System.out.print(">>");
            secondNumber = myScanner.nextFloat();
            if (op == 'D' & secondNumber == 0) {
                System.out.println("nuh uh");
            } else {
                break;
            }
        }
        System.out.println("How many Significant Figures should it output?");
        System.out.print(">>");
        int sigFigs = myScanner.nextInt();
        System.out.println();
        if (mode == 'N') {
            System.out.println(StandardCalculator.calculate(firstNumber, secondNumber, op));
        } else {
            System.out.println(ScientificCalculator.calculate(firstNumber, secondNumber, op, sigFigs));
        myScanner.close();
        }
    }
}