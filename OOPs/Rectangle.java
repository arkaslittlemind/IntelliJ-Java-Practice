package OOPs;


class RectangleTest {
    private double length;
    private double breadth;

    public RectangleTest(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getBreadth() {
        return breadth;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }

    public double area() {
        return length * breadth;
    }

    public double perimeter() {
        return (2 * (length + breadth));
    }
}
public class Rectangle {
    public static void main(String[] args) {
        RectangleTest obj1 = new RectangleTest(12.00, 3.00);

        System.out.println("Initial Area and Perimeter of Rectangle: " + obj1.area() + " and " + obj1.perimeter());

        obj1.setLength(10);
        obj1.setBreadth(4);

        System.out.println("Updated Area and Perimeter of Rectangle: " + obj1.area() + " and " + obj1.perimeter());

    }
}
