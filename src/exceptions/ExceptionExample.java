package exceptions;

import util.Input;

import java.util.Scanner;

public class ExceptionExample {
    public static void main(String[] args) {
        // ask the user for a menu choice
        // 1 = print hello
        // 2 = exit
        Input input = new Input();

        System.out.println("Choose 1 or 2. 2 exits.");
        int choice = 0;
        while(choice != 2) {
            choice = input.getInt(1, 2);
            if(choice == 1) {
                System.out.println("Hello!");
            }
        }

        System.out.println("Good bye");
    }
}
