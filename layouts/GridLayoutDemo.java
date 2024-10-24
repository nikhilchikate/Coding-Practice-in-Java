package layouts;

import javax.swing.*;
import java.awt.*;

public class GridLayoutDemo extends JFrame {
    public GridLayoutDemo() {
        setTitle("Grid Layout Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 4));

        // Using a lambda expression to handle button actions
        for (int i = 0; i < 16; i++) {
            final int buttonIndex = i; // Declare a final variable
            JButton button = new JButton("Submit " + (i + 1));
            button.addActionListener(e -> System.out.println("Button " + (buttonIndex + 1) + " clicked!"));
            add(button);
        }

        pack(); // Adjusts frame size based on components
        setLocationRelativeTo(null); // Center the frame on screen
        setVisible(true); // Make the frame visible
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(GridLayoutDemo::new);
    }
}