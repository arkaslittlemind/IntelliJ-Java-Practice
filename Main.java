import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends JFrame implements MouseMotionListener {
    private final JLabel label;

    public Main() {
        setTitle("Circle Test");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setBackground(Color.WHITE);
        panel.addMouseMotionListener(this);

        label = new JLabel("Check mouse point location");
        label.setHorizontalAlignment(JLabel.CENTER);

        getContentPane().add(panel, BorderLayout.CENTER);
        getContentPane().add(label, BorderLayout.SOUTH);
    }

    public void mouseMoved(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        int circleX = 100;
        int circleY = 60;
        int radius = 50;

        if (Math.sqrt((x - circleX) * (x - circleX) + (y - circleY) * (y - circleY)) <= radius) {
            label.setText("Mouse point inside circle at (" + x + ", " + y + ")");
        } else {
            label.setText("Check mouse point location outside of circle");
        }
    }

    public void mouseDragged(MouseEvent e) {}

    public static void main(String[] args) {
        Main ct = new Main();
        ct.setVisible(true);
    }
}
