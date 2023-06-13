import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CircleDragDemo extends JFrame {
    private JTextField xField1, yField1, radiusField1;
    private JTextField xField2, yField2, radiusField2;
    private CirclePanel circlePanel;

    public CircleDragDemo() {
        setTitle("Circle Drag Demo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        createComponents();

        setLayout(new BorderLayout());
        add(circlePanel, BorderLayout.CENTER);
        add(createControlPanel(), BorderLayout.SOUTH);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void createComponents() {
        circlePanel = new CirclePanel();

        xField1 = new JTextField(5);
        yField1 = new JTextField(5);
        radiusField1 = new JTextField(5);
        xField2 = new JTextField(5);
        yField2 = new JTextField(5);
        radiusField2 = new JTextField(5);

        circlePanel.setCircle1Values(xField1, yField1, radiusField1);
        circlePanel.setCircle2Values(xField2, yField2, radiusField2);
    }

    private JPanel createControlPanel() {
        JPanel controlPanel = new JPanel();

        JLabel label1 = new JLabel("Circle 1:");
        JLabel label2 = new JLabel("Circle 2:");
        JButton resetButton = new JButton("Reset");

        resetButton.addActionListener(e -> circlePanel.resetCircles());

        controlPanel.add(label1);
        controlPanel.add(new JLabel("X:"));
        controlPanel.add(xField1);
        controlPanel.add(new JLabel("Y:"));
        controlPanel.add(yField1);
        controlPanel.add(new JLabel("Radius:"));
        controlPanel.add(radiusField1);

        controlPanel.add(label2);
        controlPanel.add(new JLabel("X:"));
        controlPanel.add(xField2);
        controlPanel.add(new JLabel("Y:"));
        controlPanel.add(yField2);
        controlPanel.add(new JLabel("Radius:"));
        controlPanel.add(radiusField2);

        controlPanel.add(resetButton);

        return controlPanel;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(CircleDragDemo::new);
    }
}

class CirclePanel extends JPanel {
    private Circle circle1, circle2;
    private JTextField xField1, yField1, radiusField1;
    private JTextField xField2, yField2, radiusField2;

    public CirclePanel() {
        circle1 = new Circle(100, 100, 50);
        circle2 = new Circle(300, 200, 75);

        setPreferredSize(new Dimension(500, 400));
        setBackground(Color.WHITE);

        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                if (circle1.containsPoint(e.getX(), e.getY())) {
                    circle1.setDragging(true);
                } else if (circle2.containsPoint(e.getX(), e.getY())) {
                    circle2.setDragging(true);
                }
            }

            public void mouseReleased(MouseEvent e) {
                circle1.setDragging(false);
                circle2.setDragging(false);
            }
        });

        addMouseMotionListener(new MouseAdapter() {
            public void mouseDragged(MouseEvent e) {
                if (circle1.isDragging()) {
                    circle1.move(e.getX(), e.getY());
                    updateFields(circle1, xField1, yField1);
                } else if (circle2.isDragging()) {
                    circle2.move(e.getX(), e.getY());
                    updateFields(circle2, xField2, yField2);
                }

                repaint();
            }
        });
    }

    public void setCircle1Values(JTextField xField, JTextField yField, JTextField radiusField) {
        xField1 = xField;
        yField1 = yField;
        radiusField1 = radiusField;

        updateFields(circle1, xField1, yField1);
        radiusField1.setText(Integer.toString(circle1.getRadius()));
    }

    public void setCircle2Values(JTextField xField, JTextField yField, JTextField radiusField) {
        xField2 = xField;
        yField2 = yField;
        radiusField2 = radiusField;

        updateFields(circle2, xField2, yField2);
        radiusField2.setText(Integer.toString(circle2.getRadius()));
    }

    private void updateFields(Circle circle, JTextField xField, JTextField yField) {
        xField.setText(Integer.toString(circle.getX()));
        yField.setText(Integer.toString(circle.getY()));
    }

    public void resetCircles() {
        circle1.reset();
        circle2.reset();

        updateFields(circle1, xField1, yField1);
        updateFields(circle2, xField2, yField2);
        radiusField1.setText(Integer.toString(circle1.getRadius()));
        radiusField2.setText(Integer.toString(circle2.getRadius()));

        repaint();
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        circle1.draw(g);
        circle2.draw(g);
    }
}

class Circle {
    private int x;
    private int y;
    private int radius;
    private boolean dragging;

    public Circle(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        dragging = false;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getRadius() {
        return radius;
    }

    public boolean isDragging() {
        return dragging;
    }

    public void setDragging(boolean dragging) {
        this.dragging = dragging;
    }

    public boolean containsPoint(int px, int py) {
        int dx = x - px;
        int dy = y - py;
        return dx * dx + dy * dy <= radius * radius;
    }

    public void move(int px, int py) {
        x = px;
        y = py;
    }

    public void reset() {
        x = 0;
        y = 0;
        radius = 0;
        dragging = false;
    }

    public void draw(Graphics g) {
        g.setColor(Color.BLUE);
        g.fillOval(x - radius, y - radius, radius * 2, radius * 2);
    }
}
