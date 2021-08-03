import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {

        double pi = 3.14159;

        System.out.format("The value of pi is approximately: %.2f", pi);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Give me an integer!");
        int userInt = scanner.nextInt();
        System.out.println("You entered: " + userInt);

        System.out.println("Enter three words, please.");

        String firstWord = scanner.nextLine();
        String secondWord = scanner.nextLine();
        String thirdWord = scanner.nextLine();

        System.out.println(firstWord);
        System.out.println(secondWord);
        System.out.println(thirdWord);


        System.out.println("Enter a sentence, please.");

        String userSentence = scanner.nextLine();

        System.out.println(userSentence);

        System.out.println("We will need a length and width");
        System.out.print("Give us a width: ");

        double width = Double.parseDouble(scanner.nextLine());

        System.out.println("Give us a length: ");

        double length = Double.parseDouble(scanner.nextLine());

        double area = length * width;
        double perimeter = (width * 2) + (length * 2);

        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);


    }
}
