import java.util.Scanner;

public class ControlStatementsLecture {

    public static void main(String[] args) {

        String myName = "Sam";
        int age = 18;

        String someOneElseName = "Sam";

        System.out.println(myName.equals(someOneElseName));


        boolean isUserNamedSamAndIs18 = (myName.equals("Sam") && age >= 18);


        System.out.println("user meet the requirements is a " + isUserNamedSamAndIs18 + " statemnt.");


        Scanner scanner = new Scanner(System.in);
        Scanner fileScanner = new Scanner(System.in);

        System.out.print("Would you like to continue? ");
        String usersResponse =  scanner.nextLine();
        boolean userRespondedWithYes = usersResponse.toLowerCase().contains("y");

//        System.out.println(userRespondedWithYes);

        if (usersResponse.contains("YES")){

            System.out.println("Wow someone is really motivated!!");

        }else  if (userRespondedWithYes){

            System.out.println("Okay we will continue.");

        }else{

            System.out.println("Okay we will not continue.");
        }

//        Lets ask user for fav color
        System.out.print("Hey, what is your favorite color?");
        String usersFavColor = scanner.nextLine();

        switch (usersFavColor) {
            case "blue":
                System.out.println("Hey thats mine too");
                break;
            case "red":
                System.out.println("That is Herman's fav color as well.");
                break;
            default:
                System.out.println("Hey that sounds like a cool color.");
                break;
        }

        boolean userAcceptedTerms = false;

        while (!userAcceptedTerms){
            System.out.println("Do you agree to our terms and services?");
            userAcceptedTerms =  scanner.nextLine().toLowerCase().contains("y");
        }

        System.out.println("Thank you for accepting our terms and services!!");

        boolean userKnowsTheirOwnName = false;

        do {
            System.out.println("Type in your name!");
            userKnowsTheirOwnName = scanner.nextLine().equals("samuel");
        }while (!userKnowsTheirOwnName);

        System.out.println("Ya, you know your name;");

//        Based off of that color we will give response.

        // THis a classic for loop
//        for(int i = 0; i <= 100; i++){
//            System.out.println("We are at number " + i);
//        }
//
//
//        // THis is a for loop that will skip the number 45
//        for (int i = 0; i < 100; i++) {
//            if (i == 45){
//                System.out.println("Skipping number 45");
//                continue;
//            }
//
//            System.out.println(i);
//
//        }


        // THis is a for loop that will stop at the number 45
        for (int i = 0; i < 100; i++) {
            if (i == 45){
                System.out.println("Breaking at 45");
                break;
            }

            System.out.println(i);

        }

    }


}
