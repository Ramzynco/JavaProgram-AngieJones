package objects;

public class HomeAreaCalculatorWithMethods {

    public static void main(String[] args){
        Rectangle kitchen = new Rectangle(200, 400);
        Rectangle bathroom = new Rectangle(300, 700);
        double area = calculateTotalArea(kitchen, bathroom);
        System.out.println("The total area is: " + area);
    }

    public static double calculateTotalArea(Rectangle rectangle1, Rectangle rectangle2){
        return rectangle1.calculateArea() + rectangle2.calculateArea();
    }
}