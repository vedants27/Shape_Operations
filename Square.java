//Square.java 
class Square extends Shape {
    private double side;
    
     public Square(double side) {
        setShapeName("Square");
        this.side = side;
    }
    // Method to calculate area of sqare.
    public double calculateShape() {
        return side * side;
    }
     // Method to calculate perimeter of square.
    public double calculatePerimeter() {
        return 4 * side;
    }
}
