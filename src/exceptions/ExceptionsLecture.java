package exceptions;

import util.Input;

import java.io.IOException;
import java.util.InputMismatchException;

public class ExceptionsLecture {

    public static void foo() throws RuntimeException {
        throw new RuntimeException("hey something bad happened!");
    }

    public static void main(String[] args) {
        // int [] myArray = {1, 2, 3, 4, 5};

        // System.out.println(myArray[5]);
        // throw new Exception("hello world");

//        try {
//            // int result = 1 / 2;
//            // foo();
//        } catch(ArithmeticException e) {
//            System.out.println("Don't divide by zero!");
//
//        } finally {
//            System.out.println("Finally is executing!");
//
//        }

//        try {
//            foo();
//        } catch (Exception e) {
//            System.out.println("Error occurred: " + e.getMessage());
//        }
        // foo();

        int result = 0;
        while(result != 2) {
            try {
                result = getIntegerFromUser();
            } catch (InputMismatchException e) {
                System.out.println(e.getMessage());
                throw new InputMismatchException("I am a wimp!");
            }
        }

        System.out.println("End of program");

    }

    private static int getIntegerFromUser() throws InputMismatchException {
        Input input = new Input();
        System.out.print("Enter an integer: ");
        return input.getInt();
    }
}
