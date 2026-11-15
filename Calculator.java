public class calculator{
    public static void main(String[] args) {
        System.out.println("What mode do you want (N)ormal or (S)cientific:");
        char mode readLine(">>");
        System.out.println("Operation? (A)ddition, (S)ubtraction, (M)ultiplication, or (D)ivision:");
        char op = readLine(">>");
        System.out.println("First number?");
        double firstNumber = readLine(">>");
        System.out.print("Second number?");
        double secondNumber = readLine(">>");
    }
}