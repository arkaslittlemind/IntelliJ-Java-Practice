package AbstractClass;
class Rectangle extends Shape{
    double length;
    double breadth;

    public double perimeter() {
        return 2 * (length + breadth);
    }

    public double area() {
        return length * breadth;
    }
}
