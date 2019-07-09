import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Application {
    public static void main(String[] args) {
        List<Figure> listOfFigures = new ArrayList<>();
        Random random = new Random();
        int bound = random.nextInt(50);

        for (int i = 0; i<bound;i++){
            int figureNumber = random.nextInt(4);
            if (figureNumber == 0){
                listOfFigures.add(new Square(Color.values()[random.nextInt(Color.values().length)],
                        (double)Math.round(100*(random.nextInt(50) + random.nextDouble()))/100));
            }
            else if (figureNumber == 1){
                listOfFigures.add(new Circle(Color.values()[random.nextInt(Color.values().length)],
                        (double)Math.round(100*(random.nextInt(50) + random.nextDouble()))/100));
            }
            else if (figureNumber == 2){
                listOfFigures.add(new Triangle(Color.values()[random.nextInt(Color.values().length)], (double)Math.round(100*(random.nextInt(50) + random.nextDouble()))/100,
                        (double)Math.round(100*(random.nextInt(50) + random.nextDouble()))/100,
                        (double)Math.round(100*(random.nextInt(50) + random.nextDouble()))/100));
            }

            else if (figureNumber == 3){
                listOfFigures.add (new Trapezoid(Color.values()[random.nextInt(Color.values().length)], (double)Math.round(100*(random.nextInt(50) + random.nextDouble()))/100,
                        (double)Math.round(100*(random.nextInt(50) + random.nextDouble()))/100,
                        (double)Math.round(100*(random.nextInt(50) + random.nextDouble()))/100,
                        (double)Math.round(100*(random.nextInt(50) + random.nextDouble()))/100));
            }

        }

        for (Figure figure : listOfFigures){
            System.out.println(figure);
        }
    }
}
