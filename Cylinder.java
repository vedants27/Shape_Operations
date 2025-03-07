//Cylinder.java

class Cylinder extends Shape implements Volume {
    private double radius, height;

    public Cylinder(double radius, double height) {
        setShapeName("Cylinder");
        this.radius = radius;
        this.height = height;
    }
    // Method to calculate area of cylinder.
    public double calculateShape() {
        return 2 * Math.PI * radius * (radius + height);
    }
     // Method to calculate perimeter of cylinder.
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
     // Method to calculate volume of cylinder.
    public double calculateVolume() {
        return Math.PI * radius * radius * height;
    }
}
