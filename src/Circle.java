public class Circle extends Figure {
    private double radius;
    private double area;
    private Color color;

    public Circle(Color color, double radius) {
        this.color = color;
        this.radius = radius;
        this.area = this.getArea();
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public void draw() {
        System.out.println("This is circle!");
    }

    @Override
    public Color getColor() {
        return this.color;
    }

    @Override
    public double getArea() {
        return (Math.round(100*Math.PI * Math.pow(radius,2)))/100;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "color=" + color +
                ", radius=" + radius +
                ", area=" + area +
                '}';
    }
}
