//Cylinder.java

class Cylinder extends Shape implements Volume {
    private double radius, height;

    public Cylinder(double radius, double height) {
        setShapeName("Cylinder");
        this.radius = radius;
        this.height = height;
    }
}
