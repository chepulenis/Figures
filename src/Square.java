public class Square extends Figure {

    private Color color;
    private double side;
    private double area;

    public Square(Color color, double side) {
        this.color = color;
        this.side = side;
        this.area = this.getArea();
    }

    public double getSide() {
        return side;
    }

    @Override
    public void draw() {
        System.out.println("This is square!");
    }

    @Override
    public Color getColor() {
        return this.color;
    }

    @Override
    public double getArea() {
        return (Math.round(100*Math.pow(side,2)))/100;
    }

    @Override
    public String toString() {
        return "Square{" +
                "color=" + color +
                ", side=" + side +
                ", area=" + area +
                '}';
    }
}
