package OOPs;


class CircleTest {
    private double Radius;
    private final double pi;

    public CircleTest(double Radius, double pi) {
        this.Radius = Radius;
        this.pi = pi;
    }

    public double getRadius() {
        return Radius;
    }
    public void setRadius(double Radius) {
        this.Radius = Radius;
    }

    public double getArea() {
        return (pi * Math.pow(Radius, 2));
    }

    public double getCircumference() {
        return (2 * pi * Radius);
    }
}


public class Circle {
    public static void main(String[] args) {
        CircleTest circle = new CircleTest(5.67, 3.141);
        System.out.println("Area of the circle is: " + circle.getArea());
        System.out.println("Circumference of the circle is: " + circle.getCircumference());

        circle.setRadius(2);
        System.out.println("Updated area of the circle is: " + circle.getArea());
        System.out.println("Updated circumference of the circle is: " + circle.getCircumference());
    }
}
