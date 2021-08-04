public class HighLow {


    public static int getUsersToGuessedNumber(){
        System.out.println("Guess the number.");
        int usersGuessedNum = MethodsExercises.getInteger(1,100);
        return  usersGuessedNum;
    }

    public static void giveHelpfulHint(int guessedNumber, int ActualNumber){

        if (guessedNumber > ActualNumber){
            System.out.println("You need to go LOWER!");
        }else if(guessedNumber < ActualNumber){
            System.out.println("You need to go HIGHER!");
        }
    }

    public static void highLowGame() {

        int randomNumber = MethodsExercises.getRandomNumber(1,100);
        int usersLastGuess;
        int numberOfTries = 0;


        do {

           usersLastGuess = getUsersToGuessedNumber();
           giveHelpfulHint(usersLastGuess,randomNumber);
           numberOfTries++;

        }while (usersLastGuess != randomNumber);

        System.out.println("Hey you guessed right in " + numberOfTries + " number of tries!");

    }

    public static void main(String[] args) {

       highLowGame();

    }

}
