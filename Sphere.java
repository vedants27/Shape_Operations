//Sphere.java 
class Sphere extends Shape implements Volume {
    private double radius;

    public Sphere(double radius) {
        setShapeName("Sphere");
        this.radius = radius;
    }
}

