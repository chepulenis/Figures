public class Triangle extends Figure{
    private Color color;
    private double area;

    private double firstCathetus;
    private double secondCathetus;
    private double hypotenuse;

    public Triangle(Color color, double firstCathetus, double secondCathetus, double hypotenuse) {
        this.color = color;
        this.firstCathetus = firstCathetus;
        this.secondCathetus = secondCathetus;
        this.hypotenuse = hypotenuse;
        this.area = this.getArea();
    }

    @Override
    public void draw() {
        System.out.println("This is triangle!");
    }

    @Override
    public Color getColor() {
        return this.color;
    }

    @Override
    public double getArea() {
        return (firstCathetus+secondCathetus)/2;
    }

    public double getFirstCathetus() {
        return firstCathetus;
    }

    public double getSecondCathetus() {
        return secondCathetus;
    }

    public double getHypotenuse() {
        return hypotenuse;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "color=" + color +
                ", firstCathetus=" + firstCathetus +
                ", secondCathetus=" + secondCathetus +
                ", hypotenuse=" + hypotenuse +
                ", area=" + area +
                '}';
    }
}
