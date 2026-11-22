import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.*;
import java.util.Scanner;
import javax.swing.*;

public class Calculator{
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Calculator");
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

        JPanel headingPanel = new JPanel();
        JLabel headingLabel = new JLabel("Class Based Calculator - ZorGate - V0.0");
        headingPanel.add(headingLabel);

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints constr = new GridBagConstraints();
        constr.insets = new Insets(5, 5, 5, 5);
        constr.anchor = GridBagConstraints.WEST;

        constr.gridx = 0;
        constr.gridy = 0;

        JLabel Inp1Label = new JLabel("Value 1:");
        JLabel Inp2Label = new JLabel("Value 2");

        JTextField Inp1Txt = new JTextField(20);
        JTextField Inp2Txt = new JTextField(20);

        panel.add(Inp1Label, constr);
        constr.gridx = 1;
        panel.add(Inp1Txt, constr);
        constr.gridx = 0;
        constr.gridy = 1;

        panel.add(Inp2Label, constr);
        constr.gridx = 1;
        panel.add(Inp2Txt, constr);
        constr.gridx = 0;
        constr.gridy = 2;
        
        constr.gridwidth = 2;
        constr.gridheight = GridBagConstraints.CENTER;
        
        JButton button = new JButton("CALCULATE");

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                headingLabel.setText("button pressed");
            }
        });

        panel.add(button, constr);
        mainPanel.add(headingPanel);
        mainPanel.add(panel);

        frame.add(mainPanel);
        frame.pack();
        frame.setSize(400,400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

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