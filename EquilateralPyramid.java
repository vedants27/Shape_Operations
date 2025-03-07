//EquilateralPyramid.java

class EquilateralPyramid extends Shape implements Volume {
    private double base, height;

    public EquilateralPyramid(double base, double height) {
        setShapeName("Equilateral Pyramid");
        this.base = base;
        this.height = height;
    }
    // Method to calculate area of area.
    public double calculateShape() {
        return base * base + 2 * base * Math.sqrt((base * base / 4) + (height * height));
    }
    
    public double calculatePerimeter() {
        return 4 * base;
    }
     // Method to calculate volume.
    public double calculateVolume() {
        return (1.0 / 3) * base * base * height;
    }
}
