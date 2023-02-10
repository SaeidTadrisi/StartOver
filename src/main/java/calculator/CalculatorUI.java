package calculator;

import javax.swing.*;

public class CalculatorUI {

    public static final int WIDTH = 50;
    public static final int HEIGHT = 50;
    private static JTextField jTextField;
    private static String numberOne;

    private static String lastOperator;

    public static void main (String ... args){

        JFrame calculatorFrame = new JFrame("Calculator");


        jTextField = new JTextField();
        jTextField.setBounds(0,0,150,HEIGHT);
        jTextField.setEditable(false);

        JButton clear = new JButton("C");
        clear.setBounds(150,0,WIDTH,HEIGHT);
        clear.addActionListener(e -> jTextField.setText(""));

        JButton one = getButton("1", 0, 50);

        JButton two = getButton("2", 50, 50);

        JButton three = getButton("3", 100, 50);

        JButton plus = new JButton("+");
        plus.setBounds(150,50,WIDTH,HEIGHT);
        plus.addActionListener(e -> {
            numberOne = jTextField.getText();
            jTextField.setText("");
            lastOperator = plus.getText();
        });

        JButton four = getButton("4", 0, 100);

        JButton five = getButton("5", 50, 100);

        JButton six = getButton("6", 100, 100);

        JButton minus = new JButton("-");
        minus.setBounds(150,100,WIDTH,HEIGHT);
        minus.addActionListener(e -> {
            numberOne = jTextField.getText();
            jTextField.setText("");
            lastOperator = minus.getText();
        });

        JButton seven = getButton("7", 0, 150);

        JButton eight = getButton("8", 50, 150);

        JButton nine = getButton("9", 100, 150);

        JButton multiply = new JButton("x");
        multiply.setBounds(150,150,WIDTH,HEIGHT);
        multiply.addActionListener(e -> {
            numberOne = jTextField.getText();
            jTextField.setText("");
            lastOperator = multiply.getText();
        });

        JButton point = getButton(".", 0, 200);

        JButton zero = getButton("0", 50, 200);

        JButton equal = new JButton("=");
        equal.setBounds(100,200,WIDTH,HEIGHT);
        equal.addActionListener(e -> {
            final Calculator calculator = new Calculator();
            switch (lastOperator) {
                case "+": {
                    String result = calculator.add(numberOne, jTextField.getText());
                    jTextField.setText(result);
                    break;
                }
                case "-": {
                    String result = calculator.min(numberOne, jTextField.getText());
                    jTextField.setText(result);
                    break;
                }
                case "x":{
                    String result = calculator.multi(numberOne,jTextField.getText());
                    jTextField.setText(result);
                    break;
                }
                case "/": {
                    String result = calculator.div(numberOne,jTextField.getText());
                    jTextField.setText(result);
                    break;
                }
            }

        });

        JButton division = new JButton("/");
        division.setBounds(150,200,WIDTH,HEIGHT);
        division.addActionListener(e -> {
            numberOne = jTextField.getText();
            jTextField.setText("");
            lastOperator = division.getText();
        });

        calculatorFrame.add(jTextField);
        calculatorFrame.add(clear);
        calculatorFrame.add(one);
        calculatorFrame.add(two);
        calculatorFrame.add(three);
        calculatorFrame.add(plus);
        calculatorFrame.add(four);
        calculatorFrame.add(five);
        calculatorFrame.add(six);
        calculatorFrame.add(minus);
        calculatorFrame.add(seven);
        calculatorFrame.add(eight);
        calculatorFrame.add(nine);
        calculatorFrame.add(multiply);
        calculatorFrame.add(point);
        calculatorFrame.add(zero);
        calculatorFrame.add(equal);
        calculatorFrame.add(division);

        calculatorFrame.setSize(217,290);
        calculatorFrame.setLayout(null);
        calculatorFrame.setVisible(true);

    }

    private static JButton getButton(String Label, int xPosition, int yPosition) {
        JButton button = new JButton(Label);
        button.setBounds(xPosition, yPosition, WIDTH, HEIGHT);
        button.addActionListener(event -> jTextField.setText(jTextField.getText() + button.getText()));
        return button;
    }
}
