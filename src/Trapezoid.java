public class Trapezoid extends Figure{
    private Color color;
    private double area;

    private double firstBase;
    private double secondBase;
    private double leftSide;
    private double rightSide;

    public Trapezoid(Color color, double firstBase, double secondBase, double leftSide, double rightSide) {
        this.color = color;
        this.firstBase = firstBase;
        this.secondBase = secondBase;
        this.leftSide = leftSide;
        this.rightSide = rightSide;
        this.area = this.getArea();
    }

    @Override
    public void draw() {
        System.out.println("This is trapezoid!");
    }

    @Override
    public Color getColor() {
        return color;
    }

    @Override
    public double getArea() {
        return (firstBase + secondBase)/2 * Math.sqrt(Math.pow(leftSide,2) -
                Math.pow((Math.pow((secondBase - firstBase),2) + Math.pow(leftSide,2) - Math.pow(rightSide,2))/
                        (2*(secondBase-firstBase)),2));
    }

    public double getFirstBase() {
        return firstBase;
    }

    public double getSecondBase() {
        return secondBase;
    }

    public double getLeftSide() {
        return leftSide;
    }

    public double getRightSide() {
        return rightSide;
    }

    @Override
    public String toString() {
        return "Trapezoid{" +
                "color='" + color + '\'' +
                ", firstBase=" + firstBase +
                ", secondBase=" + secondBase +
                ", leftSide=" + leftSide +
                ", rightSide=" + rightSide +
                ", area=" + area +
                '}';
    }
}
