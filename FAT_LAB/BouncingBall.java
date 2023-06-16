package FAT_LAB;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BouncingBall extends JPanel implements MouseListener, Runnable {
    private static final int PANEL_WIDTH = 600;
    private static final int PANEL_HEIGHT = 400;
    private static final int BALL_SIZE = 30;
    private static final int MAX_BALLS = 20;

    private List<Ball> balls;

    public BouncingBall() {
        balls = new ArrayList<>();

        setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
        setBackground(Color.WHITE);
        addMouseListener(this);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        for (Ball ball : balls) {
            g.setColor(ball.getColor());
            g.fillOval(ball.getX(), ball.getY(), ball.getSize(), ball.getSize());
        }
    }

    private void addBall(int x, int y) {
        if (balls.size() >= MAX_BALLS) {
            System.out.println("Maximum number of balls reached.");
            return;
        }

        Random random = new Random();
        Color color = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
        Ball ball = new Ball(x, y, BALL_SIZE, color);
        balls.add(ball);

        Thread thread = new Thread(this);
        thread.start();
    }

    private void updateBall(Ball ball) {
        int x = ball.getX();
        int y = ball.getY();
        int size = ball.getSize();

        if (x < 0 || x + size > PANEL_WIDTH) {
            ball.setDx(-ball.getDx());
            size += 5;
        }

        if (y < 0 || y + size > PANEL_HEIGHT) {
            ball.setDy(-ball.getDy());
            size -= 5;
        }

        ball.setX(x + ball.getDx());
        ball.setY(y + ball.getDy());
        ball.setSize(size);
    }

    @Override
    public void run() {
        while (true) {
            for (Ball ball : balls) {
                updateBall(ball);
            }

            repaint();

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
        addBall(e.getX(), e.getY());
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Bouncing Ball");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        BouncingBall bouncingBall = new BouncingBall();
        frame.getContentPane().add(bouncingBall);

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}

class Ball {
    private int x;
    private int y;
    private int size;
    private int dx;
    private int dy;
    private Color color;

    public Ball(int x, int y, int size, Color color) {
        this.x = x;
        this.y = y;
        this.size = size;
        this.color = color;
        this.dx = 1;
        this.dy = 1;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getDx() {
        return dx;
    }

    public void setDx(int dx) {
        this.dx = dx;
    }

    public int getDy() {
        return dy;
    }

    public void setDy(int dy) {
        this.dy = dy;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
