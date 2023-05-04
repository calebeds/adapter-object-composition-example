import calculator.Calculator;
import calculator.CalculatorAdapter;
import calculator.CalculatorInterface;
import shapes.Triangle;

public class Client {
    public static void main(String[] args) {
        System.out.println("*** Adapter Pattern Demo ***");

        Triangle triangle = new Triangle(20, 10);

        CalculatorInterface calculatorAdapter = new CalculatorAdapter(triangle);

        System.out.println("Area of Triangle is: " + calculatorAdapter.getArea(null));
    }
}