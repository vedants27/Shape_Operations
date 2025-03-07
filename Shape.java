//Shape.java
abstract class Shape {
    protected String shapeName;

    // Setter to assign shape name.
    public void setShapeName(String shape) {
        this.shapeName = shape;
    }

    public abstract double calculateShape();// Abstract method to calculate the area of the shape
    public abstract double calculatePerimeter();// Abstract method to calculate the perimeter of the shape
}

