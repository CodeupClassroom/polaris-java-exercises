import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {


        int i = 5;

        while (i <= 15) {
            System.out.print(i + " ");
            i++;
        }


        int counter = 0;

        do {
            System.out.println(counter);
            counter += 2;
            counter = counter + 2;
        } while (counter <= 100);


        int backwardsCounter = 100;

        do {
            System.out.println(backwardsCounter);
            backwardsCounter -= 5;

        } while (backwardsCounter >= -10);

        for (int backCount = 100; backCount >= -10; backCount -= 5) {
            System.out.println(backCount);
        }

        long twoCounter = 2L;

        do {
            System.out.println(twoCounter);
            twoCounter *= twoCounter;
            twoCounter = twoCounter * twoCounter;
        } while (twoCounter < 1000000L);

        for (long longI = 2L; longI < 1000000L; longI *= longI) {
            System.out.println(longI);
        }


        for (int fizzI = 1; fizzI <= 100; fizzI++) {
            if (fizzI % 5 == 0 && fizzI % 3 == 0) {
                System.out.println("FizzBuzz");
            } else if (fizzI % 5 == 0) {
                System.out.println("Buzz");
            } else if (fizzI % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(fizzI);
            }

        }


        Scanner scanner = new Scanner(System.in);

        boolean userContinues = true;

        do {
            System.out.println("What number would you like to go up to?");
            int userInt = scanner.nextInt();
            System.out.println("\nHere is your table!\n");
            System.out.println("number | squared | cubed");
            System.out.println("------ | ------- | -----");
            for (int numI = 1; numI <= userInt; numI++) {
                System.out.printf("%-6d", numI);
                System.out.print(" | ");
                System.out.printf("%-7d", numI * numI);
                System.out.print(" | ");
                System.out.print(numI * numI * numI);
                //Docrob alternate table display
                //System.out.printf("%-6d | %-7d | %-5d\n", i, i*i, i*i*i);
                System.out.println();
            }
            System.out.println("Would you like to enter another number (y/n)?");
            String userResponse = scanner.next();
            if (!userResponse.equalsIgnoreCase("y")) {
                userContinues = false;
            }


        } while (userContinues);


        boolean anotherGrade = true;

        do {
            System.out.println("Please enter a numerical grade from 0 - 100");

            int userGrade = scanner.nextInt();

            if (userGrade >= 88) {
                System.out.println("A");
            } else if (userGrade >= 80) {
                System.out.println("B");
            } else if (userGrade >= 67) {
                System.out.println("C");
            } else if (userGrade >= 60) {
                System.out.println("D");
            } else {
                System.out.println("F");
            }

            System.out.println("Do you want to enter a new grade? (y/n)?");

            String userResponse = scanner.next();


            if (!userResponse.equalsIgnoreCase("y")) {
                anotherGrade = false;
            }


        } while (anotherGrade);


    }
}
