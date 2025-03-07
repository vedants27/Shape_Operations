//Circle.java

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        setShapeName("Circle");
        this.radius = radius;
    }
    // Method to calculate and return the area ofcircle
    public double calculateShape() {
        return Math.PI * radius * radius;
    }
    //Method to calculate perimeter of circle.
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}
