package animation;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyListenerDemo {
    public static void main(String[] args) {
        Animation a = new Animation("Key Listener Demo");
        a.setSize(1000, 800);
        a.setVisible(true);
    }
}

class Animation extends Frame implements KeyListener {
    int x = 50, y = 50, w = 200, h = 150, sc;

    Animation(String title) {
        super(title);
        addKeyListener(this);
    }

    public void keyPressed(KeyEvent ke) {
        sc = ke.getKeyCode();

        if (sc == KeyEvent.VK_RIGHT) {
            x = x + 5;
            repaint();
        } else if (sc == KeyEvent.VK_LEFT) {
            x = x - 5;
            repaint();
        } else if (sc == KeyEvent.VK_UP) {
            y = y - 5;
            repaint();
        } else if (sc == KeyEvent.VK_DOWN) {
            y = y + 5;
            repaint();
        } else {

        }
    }

    public void keyReleased(KeyEvent ke) {
        x = x - 5;
        repaint();
    }

    public void keyTyped(KeyEvent ke){

    }

    public void paint(Graphics g) {
        g.drawRect(x, y, w, h);
    }
}
