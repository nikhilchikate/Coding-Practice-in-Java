package layouts;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class BorderLayoutDemo extends JFrame {
    private JTextField userTextField;
    private JPasswordField passwordField;
    private JLabel loginLabel;

    public BorderLayoutDemo() {
        setTitle("Login Form");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10, 10)); // Adding gaps between components

        // Create UI components
        loginLabel = new JLabel("Login", SwingConstants.CENTER);
        JLabel userLabel = new JLabel("User:");
        JLabel passwordLabel = new JLabel("Password:");

        userTextField = new JTextField(10);
        passwordField = new JPasswordField(10);
        JButton submitButton = new JButton("Submit");

        // Add action listener for the button
        submitButton.addActionListener(this::handleSubmit);

        // Add components to the frame
        add(loginLabel, BorderLayout.NORTH);

        JPanel centerPanel = new JPanel(new GridLayout(2, 2, 10, 10));
        centerPanel.add(userLabel);
        centerPanel.add(userTextField);
        centerPanel.add(passwordLabel);
        centerPanel.add(passwordField);
        add(centerPanel, BorderLayout.CENTER);

        add(submitButton, BorderLayout.SOUTH);

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
        SwingUtilities.invokeLater(BorderLayoutDemo::new);
    }
}

