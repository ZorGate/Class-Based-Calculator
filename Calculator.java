import java.util.Scanner;

public class Calculator{
    public static void run(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("What mode do you want (N)ormal or (S)cientific:");
        char mode = myScanner.nextLine(">>");
        System.out.println("Operation? (A)ddition, (S)ubtraction, (M)ultiplication, or (D)ivision:");
        char op = readLine(">>");
        System.out.println("First number?");
        double firstNumber = readLine(">>");
        System.out.print("Second number?");
        double secondNumber = readLine(">>");
    }
}