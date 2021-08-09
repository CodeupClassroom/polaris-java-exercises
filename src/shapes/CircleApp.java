package shapes;

import util.Input;

public class CircleApp {

    public static void main(String[] args) {
        Input input = new Input();

        Circle circle;

        // BONUS: USE WHILE LOOP AND INPUT YESNO METHOD
        while (input.yesNo()) {
            circle = new Circle(input.getDouble());
            System.out.println("Area: " + circle.getArea());
            System.out.println("Circumference: " + circle.getCircumference());
        }

        // BONUS: GET COUNT FROM STATIC METHOD ON CIRCLE CLASS AT END OF PROGRAM
        System.out.println("Circle count: " + Circle.getCount());

    }
}
