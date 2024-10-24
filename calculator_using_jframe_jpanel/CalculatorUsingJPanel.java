package calculator_using_jframe_jpanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class CalculatorUsingJPanel extends JPanel implements ActionListener {
    private JTextField display = new JTextField("0");
    private String buttonText = "789/456*123-0.=+C";
    private double result = 0;
    private String operator = "=";
    private boolean calculating = true;

    public CalculatorUsingJPanel() {
        setLayout(new BorderLayout());
        display.setEditable(false);
        display.setHorizontalAlignment(JTextField.RIGHT);
        add(display, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(5, 4));

        for (int i = 0; i < buttonText.length(); i++) {
            JButton button = new JButton(buttonText.substring(i, i + 1));
            button.addActionListener(this);
            buttonPanel.add(button);
        }
        add(buttonPanel, BorderLayout.CENTER);
    }

    public void actionPerformed(ActionEvent evt) {
        String cmd = evt.getActionCommand();

        if ("C".equals(cmd)) {
            resetCalculator();
            return;
        }

        if (Character.isDigit(cmd.charAt(0)) || cmd.equals(".")) {
            if (calculating) {
                display.setText(cmd);
            } else {
                display.setText(display.getText() + cmd);
            }
            calculating = false;
        } else {
            handleOperator(cmd);
        }
    }

    private void handleOperator(String cmd) {
        if (calculating) {
            if ("-".equals(cmd)) {
                display.setText(cmd);
                calculating = false;
            } else {
                operator = cmd;
            }
        } else {
            double x = Double.parseDouble(display.getText());
            calculate(x);
            operator = cmd;
            calculating = true;
        }
    }

    private void calculate(double n) {
        switch (operator) {
            case "+" -> result += n;
            case "-" -> result -= n;
            case "*" -> result *= n;
            case "/" -> {
                if (n != 0) {
                    result /= n;
                } else {
                    display.setText("Error");
                    return;
                }
            }
            case "=" -> result = n;
        }
        display.setText("" + result);
    }

    private void resetCalculator() {
        result = 0;
        operator = "=";
        calculating = true;
        display.setText("0");
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 400);
        frame.add(new CalculatorUsingJPanel());
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
