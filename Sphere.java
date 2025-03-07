//Sphere.java 
class Sphere extends Shape implements Volume {
    private double radius;

    public Sphere(double radius) {
        setShapeName("Sphere");
        this.radius = radius;
    }
    // Method to calculate area of sphere.
    public double calculateShape() {
        return 4 * Math.PI * radius * radius;
    }
    
    public double calculatePerimeter() {
        return 0; // Not applicable
    }
     // Method to calculate volume of sphere.
    public double calculateVolume() {
        return (4.0 / 3) * Math.PI * Math.pow(radius, 3);
    }
}

