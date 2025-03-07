//Rectangle.java

class Rectangle extends Shape {
    private double length, width;

    public Rectangle(double length, double width) {
        setShapeName("Rectangle");
        this.length = length;
        this.width = width;
    }    
    // Method to calculate area of rectangle.
    public double calculateShape() {
        return length * width;
    }
    
}
