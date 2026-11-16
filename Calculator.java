import java.util.Scanner;

public class Calculator{
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("What mode do you want (N)ormal or (S)cientific:");
        System.out.print(">>");
        char mode = myScanner.next().charAt(0);
        System.out.println("Operation? (A)ddition, (S)ubtraction, (M)ultiplication, or (D)ivision:");
        System.out.print(">>");
        char op = myScanner.next().charAt(0);
        System.out.println("First number?");
        System.out.print(">>");
        int firstNumber = myScanner.nextInt();
        System.out.println("Second number?");
        System.out.print(">>");
        int secondNumber = myScanner.nextInt();
        if (mode == 'N') {
            System.out.println(StandardCalculator.calculate(firstNumber, secondNumber, op));
        } else if (mode == 'S') {
            System.out.println(StandardCalculator.calculate(firstNumber, secondNumber, op));
        } else {
            System.out.println("The mode you selected is invalid. Please make sure you're typing either \"N\" or \"S\".");
        }
    }
}