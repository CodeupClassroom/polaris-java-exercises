public class SyntTypeVarLec {
    public static void main(String[] args) {
        System.out.println("Hello, World");
//        System.out.print("Hello, ");
//        System.out.print("World");

        // JS way of variable declaration
        // let nameOfVar = 123

        // JAVA way variable declaration
        // int newNumber;
        // newNumber = 5; or in one step...
        // int newNumber = 5;


        // EXAMPLE VARIABLES OF EACH DATA TYPE
        byte dayOfMonth = 31;

        short employees = 129;

        int carPrice = 50000;

        long diameterOfMilkyWay = 7574875807807879L;

        float gradeAverage = 93.35f;

        double testDouble = 93.357890787;

        char yesNo = 'Y';

        boolean ryLikesBeer = true;

        boolean ryHatesPizza = false;

        String name = "Ry Sutton";


        // ESCAPE CHARACTERS
        String criminalMindsQuote = "\"Some cheesy quote\" \n - Probably Mark Twain";

        String rockNRoll = "\t\\m/";

        System.out.println(rockNRoll);

        // DONT DO THIS ABSTRACT IS RESERVED WORD AND CANNOT BE USED AS IDENTIFIER
        // int abstract = 4;

        final int SIDES_OF_A_DICE = 6;
        final String API_KEY = "b75b703d8195f6f433ca";
        final String GITHUB_API_BASE_URL = "https://api.github.com";

        // CANT REASSIGN VALUES TO FINAL
        // SIDES_OF_A_DICE = 8;


        // BINARY ARITHMETIC OPERATORS (TWO OPERANDS)
        int sum = 5 + 6;

        int difference = 5 - 6;

        int multiply = 5 * 6;

        double divide = 10 / 3f;

        int remainder = 4 % 2;

        // System.out.println(difference);
        // System.out.println(multiply);
        // System.out.println(divide);
        // System.out.println(remainder);
        // System.out.println(sum);


        // UNARY ARITHMETIC OPERATORS (ONE OPERAND)
        int someNumber = 5;



        // POST DEC
        // System.out.println(someNumber++); //5
        // System.out.println(someNumber++); //6
        // System.out.println(someNumber++); //7


        // PRE DEC
        // System.out.println(++someNumber); //6
        // System.out.println(++someNumber); //7
        // System.out.println(++someNumber); //8

        someNumber += 1;
        System.out.println(someNumber);

        // IMPLICIT CASTING - GETTING MORE PRECISE
        short myNewShort = 900;
        long morePrecise = myNewShort; // SAME VALUE JUST A MORE PRECISE DATA TYPE

        // EXPLICIT CASTING - GETTING LESS PRECISE - IN THIS CASE LOSING DECIMAL POINTS
        double pi = 3.14159;
        int almostPi = (int) pi;

        System.out.println(almostPi); //3

    }
}
