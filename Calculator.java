import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.*;
import java.util.Scanner;
import javax.swing.*;

public class Calculator{
    static char mode = 'N';
    static char op = 'A';
    static float firstNumber = 0;
    static float secondNumber = 0;
    public static void main(String[] args) {
        //create the frame + mainpanel
        JFrame frame = new JFrame();
        frame.setTitle("Calculator");
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

        //Add the heading
        JPanel headingPanel = new JPanel();
        JLabel headingLabel = new JLabel("Class Based Calculator - ZorGate - V0.0: ");
        JLabel modeHLabel = new JLabel("Standard");
        headingPanel.add(headingLabel);
        headingPanel.add(modeHLabel);

        //make a panel for switching between scientific and standard notation
        JPanel modePanel = new JPanel(new GridBagLayout());

        //create the text and button for the sci/std notation panel
        JLabel modeLabel = new JLabel("Mode: ");
        JButton modeButton = new JButton("Standard");
        modeButton.setBackground(Color.WHITE);
        modeButton.setForeground(Color.BLACK);
        modeButton.setFocusPainted(false);
        modePanel.add(modeLabel);
        modePanel.add(modeButton);

        //make a panel to store the operation type selection buttons
        JPanel opPanel = new JPanel(new GridBagLayout());
        GridBagConstraints selC = new GridBagConstraints();
        selC.insets = new Insets(5,5,5,5);

        //create the mode selection buttons (+,-,x,/)
        JButton add = new JButton("+");
        selC.gridx = 0; //position the button
        selC.gridy = 0;
        opPanel.add(add,selC); //add it to the mode selection panel
        add.setBackground(Color.BLACK); //to indicate that addition is currently selected
        add.setForeground(Color.WHITE); //make text visible
        add.setFocusPainted(false); //get rid of the annoying box around button text
        JButton sub = new JButton("-");
        selC.gridx = 1;
        selC.gridy = 0;
        opPanel.add(sub,selC);
        sub.setBackground(Color.WHITE); //everything but addition is currently unselected
        sub.setForeground(Color.BLACK); //visibility again
        sub.setFocusPainted(false);
        JButton mul = new JButton("x");
        selC.gridx = 2;
        selC.gridy = 0;
        opPanel.add(mul,selC);
        mul.setBackground(Color.WHITE);
        mul.setForeground(Color.BLACK);
        mul.setFocusPainted(false);
        JButton div = new JButton("/");
        selC.gridx = 3;
        selC.gridy = 0;
        opPanel.add(div,selC);
        div.setBackground(Color.WHITE);
        div.setForeground(Color.BLACK);
        div.setFocusPainted(false);


        //create the panel for text inputs and add a constraint
        JPanel textPanel = new JPanel(new GridBagLayout());
        GridBagConstraints constr = new GridBagConstraints();

        //create the text next to each of the text inputs
        JLabel Inp1Label = new JLabel("Value 1:");
        JLabel Inp2Label = new JLabel("Value 2");

        //where the output will show up
        JLabel outLabel = new JLabel("=");
        JLabel output = new JLabel("");

        //create the actual text inputs
        JTextField Inp1Txt = new JTextField(15);
        JTextField Inp2Txt = new JTextField(15);

        //add the inputs and labels
        textPanel.add(Inp1Label, constr);
        constr.gridx = 1;
        textPanel.add(Inp1Txt, constr);
        constr.gridx = 0;
        constr.gridy = 1;
        textPanel.add(Inp2Label, constr);
        constr.gridx = 1;
        textPanel.add(Inp2Txt, constr);
        constr.gridx = 0;
        constr.gridy = 2;

        //add output text
        textPanel.add(outLabel,constr);
        constr.gridx = 1;
        textPanel.add(output, constr);
        constr.gridx = 0;
        constr.gridy = 4;

        //make the calculate button
        JButton calculate = new JButton("CALCULATE");
        JPanel btnPanel = new JPanel();
        btnPanel.add(calculate);
        calculate.setBackground(Color.WHITE);
        calculate.setForeground(Color.BLACK);
        calculate.setFocusPainted(false);

        mainPanel.add(headingPanel);
        mainPanel.add(modePanel);
        mainPanel.add(opPanel);
        mainPanel.add(textPanel);
        mainPanel.add(btnPanel);

        frame.add(mainPanel);
        frame.pack();
        frame.setSize(400,400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        modeButton.addActionListener(e -> {
            if (mode == 'S') {
                mode = 'N';
                modeHLabel.setText("Standard");
                modeButton.setBackground(Color.WHITE);
                modeButton.setForeground(Color.BLACK);
                modeButton.setText("Standard");
            } else {
                mode = 'S';
                modeHLabel.setText("Scientific");
                modeButton.setBackground(Color.BLACK);
                modeButton.setForeground(Color.WHITE);
                modeButton.setText("Scientific");
            }
        });
    }

        /*while (true) {
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
        }*/
    
}