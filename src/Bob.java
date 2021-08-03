import java.sql.SQLOutput;
import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {

        boolean continuePlease = true;

        while (continuePlease){
            bobSequence();
            continuePlease = bobSequence();
        }
    }

    private static boolean bobSequence(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Say something to Bob?");
        String userResponse = scanner.nextLine().trim();

        if (userResponse.endsWith("?")) {
            System.out.println("Sure.");
        } else if (userResponse.endsWith("!")){
            System.out.println("Whoa, chill out!");
        } else if (userResponse.isEmpty()) {
            System.out.println("Fine. Be that way!");
        } else {
            System.out.println("Whatever.");
        }

        System.out.println("Would you like to say something else to Bob?");
        String response = scanner.next();
        if (!response.equalsIgnoreCase("y")){
            return false;
        }
        return true;
    }
}
