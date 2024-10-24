package animation;

import javax.swing.*;
import java.awt.*;

public class Animate extends JPanel implements Runnable {
    private Thread thread;
    private int x1 = 0, x2 = 380, y1 = 50, y2 = 250;

    public Animate() {
        setPreferredSize(new Dimension(400, 300));
        setBackground(Color.CYAN);
        startAnimation();
    }

    private void startAnimation() {
        if (thread == null) {
            thread = new Thread(this);
            thread.start();
        }
    }

    public void stopAnimation() {
        if (thread != null) {
            thread = null;
        }
    }

    @Override
    public void run() {
        while (thread != null) {
            repaint();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK);

        x1 = (x1 + 16) % 400;
        x2 = (x2 - 16 + 400) % 400; // Ensuring x2 wraps around correctly
        y1 = (y1 + 12) % 300;
        y2 = (y2 - 12 + 300) % 300; // Ensuring y2 wraps around correctly

        g.fillRect(0, 130, 400, 40);
        g.fillRect(180, 0, 40, 305);

        g.setColor(Color.WHITE);
        for (int i = 0; i < 20; i++) {
            if (i != 9 && i != 10) {
                g.drawLine(i * 20, 150, i * 20 + 10, 150);
            }
        }

        for (int j = 0; j < 15; j++) {
            if (j != 7 && j != 8) {
                g.drawLine(200, j * 20, 200, j * 20 + 10);
            }
        }

        g.setColor(Color.RED);
        g.fillRoundRect(x2, 152, 20, 8, 2, 2);
        g.fillRoundRect(x1, 140, 20, 8, 2, 2);
        g.fillRoundRect(190, y1, 8, 20, 2, 2);
        g.fillRoundRect(202, y2, 8, 20, 2, 2);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Animation");
        Animate animation = new Animate();
        frame.add(animation);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}


/*
package animation;

import java.applet.*;
import java.awt.*;

public class Animate extends Applet implements Runnable{
    Thread t;
    int x1 = 0, x2 = 380, y1 = 50, y2 = 250;

    public void start(){
        if(t == null){
            t = new Thread(this, "New Thread");
            t.start();
        }
    }

    public void stop(){
        if(t != null)
            t = null;
    }

    public void run(){
        Thread t1 = Thread.currentThread();
        while(t == t1){
            repaint();
            try{
                Thread.sleep(100);
            } catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    public void paint(Graphics g){
        setBackground(Color.CYAN);
        g.setColor(Color.BLACK);

        x1 = (x1+16) % 400;
        x2 = x2 - 16;
        y1 = (y1 + 12) % 300;
        y2 = y2 -12;

        if(y2 < 0)
            y2 = 288;
        if (x2 < 0)
            x2 = 384;

        g.fillRect(0, 130, 400, 40);
        g.fillRect(180, 0, 40, 305);

        g.setColor(Color.white);
        for(int i = 0; i < 20; i++) {
            if (i !=9 && i != 10)
                g.drawLine(i*20, 150, i*20 + 10, 150);
        }

        for (int j = 0; j < 15; j++){
            if(j != 7 && j != 8)
                g.drawLine(200, j*20, 200, j *20+10);
        }

        g.setColor(Color.red);

        g.fillRoundRect(x2, 152, 20, 8,2,2);
        g.fillRoundRect(x1, 140, 20, 8,2,2);
        g.fillRoundRect(190, y1, 8, 20,2,2);
        g.fillRoundRect(202, y2, 8, 20,2,2);
    }
}
*/
