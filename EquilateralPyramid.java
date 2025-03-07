//EquilateralPyramid.java

class EquilateralPyramid extends Shape implements Volume {
    private double base, height;

    public EquilateralPyramid(double base, double height) {
        setShapeName("Equilateral Pyramid");
        this.base = base;
        this.height = height;
    }
}
