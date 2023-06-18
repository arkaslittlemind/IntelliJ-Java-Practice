package AbstractClass;

class Circle extends Shape{
    double radius;
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }
}
