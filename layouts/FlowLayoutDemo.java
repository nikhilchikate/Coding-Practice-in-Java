package layouts;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class FlowLayoutDemo extends JFrame {
    private JTextField userTextField;
    private JPasswordField passwordField;
    private JLabel loginLabel;

    public FlowLayoutDemo() {
        setTitle("Login Form");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout(FlowLayout.CENTER, 100, 100));

        // Create UI components
        loginLabel = new JLabel("Login");
        JLabel userLabel = new JLabel("User:");
        JLabel passwordLabel = new JLabel("Password:");

        userTextField = new JTextField(10);
        passwordField = new JPasswordField(10);
        JButton submitButton = new JButton("Submit");

        // Add action listener for the button
        submitButton.addActionListener(this::handleSubmit);

        // Add components to the frame
        add(loginLabel);
        add(userLabel);
        add(userTextField);
        add(passwordLabel);
        add(passwordField);
        add(submitButton);

        // Finalize frame setup
        pack();
        setLocationRelativeTo(null); // Center the frame
        setVisible(true);
    }

    private void handleSubmit(ActionEvent e) {
        String user = userTextField.getText();
        String password = new String(passwordField.getPassword());
        System.out.println("User: " + user + ", Password: " + password);
        // Add additional login logic here
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(FlowLayoutDemo::new);
    }
}
