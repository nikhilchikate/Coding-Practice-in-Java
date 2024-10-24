package layouts;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CardLayoutDemo extends JFrame implements ActionListener {
    private CardLayout cardLayout;
    private JPanel deck;
    private JButton windowsButton;
    private JButton otherButton;

    public CardLayoutDemo() {
        setTitle("Card Layout Example");
        setSize(1200, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Create buttons
        windowsButton = new JButton("Windows");
        otherButton = new JButton("Other");

        // Add action listeners
        windowsButton.addActionListener(this);
        otherButton.addActionListener(this);

        // Initialize CardLayout and deck
        cardLayout = new CardLayout();
        deck = new JPanel(cardLayout);

        // Create panels for different cards
        JPanel windowsPanel = createWindowsPanel();
        JPanel otherPanel = createOtherPanel();

        // Add panels to the deck
        deck.add(windowsPanel, "Windows");
        deck.add(otherPanel, "Other");

        // Add components to the frame
        add(windowsButton);
        add(otherButton);
        add(deck);

        setLocationRelativeTo(null); // Center the frame
        setVisible(true);
    }

    private JPanel createWindowsPanel() {
        JPanel panel = new JPanel();
        panel.add(new JCheckBox("Windows XP"));
        panel.add(new JCheckBox("Windows 7"));
        panel.add(new JCheckBox("Windows 10"));
        return panel;
    }

    private JPanel createOtherPanel() {
        JPanel panel = new JPanel();
        panel.add(new JCheckBox("Ubuntu"));
        panel.add(new JCheckBox("Macintosh"));
        panel.add(new JCheckBox("Red Hat"));
        return panel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == windowsButton) {
            cardLayout.show(deck, "Windows");
        } else if (e.getSource() == otherButton) {
            cardLayout.show(deck, "Other");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(CardLayoutDemo::new);
    }
}

