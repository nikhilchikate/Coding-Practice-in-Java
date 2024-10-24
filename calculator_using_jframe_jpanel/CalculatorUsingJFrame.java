package calculator_using_jframe_jpanel;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CalculatorUsingJFrame extends JFrame implements ActionListener {
    private JTextField jtx;
    private double result, temp;
    private char operator;
    private boolean newOperation = true;

    public CalculatorUsingJFrame() {
        setTitle("Calculator");
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        jtx = new JTextField();
        jtx.setFont(new Font("Arial", Font.PLAIN, 24));
        jtx.setHorizontalAlignment(SwingConstants.RIGHT);
        jtx.setEditable(false);
        add(jtx, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(5, 4, 5, 5));
        String[] buttonLabels = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", "C", "=", "+",
                "sin", "cos", "tan", "sqrt"
        };

        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            button.addActionListener(this);
            buttonPanel.add(button);
        }

        add(buttonPanel, BorderLayout.CENTER);
    }

    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        switch (command) {
            case "C":
                clear();
                break;
            case "=":
                calculate();
                break;
            case "sin":
                applyFunction("sin");
                break;
            case "cos":
                applyFunction("cos");
                break;
            case "tan":
                applyFunction("tan");
                break;
            case "sqrt":
                applyFunction("sqrt");
                break;
            default:
                handleNumberOrOperator(command);
        }
    }

    private void clear() {
        jtx.setText("");
        result = 0;
        operator = '\0';
        newOperation = true;
    }

    private void calculate() {
        if (newOperation) return;
        double current = Double.parseDouble(jtx.getText());
        switch (operator) {
            case '+':
                result += current;
                break;
            case '-':
                result -= current;
                break;
            case '*':
                result *= current;
                break;
            case '/':
                if (current != 0) {
                    result /= current;
                } else {
                    jtx.setText("Error");
                    return;
                }
                break;
        }
        jtx.setText(String.valueOf(result));
        newOperation = true;
    }

    private void handleNumberOrOperator(String command) {
        if ("0123456789".contains(command)) {
            if (newOperation) {
                jtx.setText(command);
                newOperation = false;
            } else {
                jtx.setText(jtx.getText() + command);
            }
        } else {
            if (!newOperation) {
                calculate();
            }
            operator = command.charAt(0);
            result = Double.parseDouble(jtx.getText());
            newOperation = true;
        }
    }

    private void applyFunction(String function) {
        if (jtx.getText().isEmpty()) return;
        double value = Double.parseDouble(jtx.getText());
        switch (function) {
            case "sin":
                jtx.setText(String.valueOf(Math.sin(value)));
                break;
            case "cos":
                jtx.setText(String.valueOf(Math.cos(value)));
                break;
            case "tan":
                jtx.setText(String.valueOf(Math.tan(value)));
                break;
            case "sqrt":
                jtx.setText(String.valueOf(Math.sqrt(value)));
                break;
        }
        newOperation = true;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            CalculatorUsingJFrame calculator = new CalculatorUsingJFrame();
            calculator.setVisible(true);
        });
    }
}