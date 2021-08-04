import java.util.Scanner;

public class MethodsExercises {

    public static double Addition(double numOne, double numTwo){
        return numOne + numTwo;
    }

    public static double Subtraction(double numOne, double numTwo){
        return numOne - numTwo;
    }

    public static double Multiplication(double numOne, double numTwo){


        double totalAdded = 0;

        for (int i = 0; i < numTwo; i++){
            totalAdded += numOne;
        }

        return totalAdded;
    }

    public static double Division(double numOne, double numTwo){
        return numOne / numTwo;
    }

    public static double Modulus(double numOne, double numTwo){

        if (numTwo == 0){
            return numOne;
        }

        return numOne % numTwo;
    }

    public static int getIntegerRecursion(int min, int max){

        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter a number between "+ min +" and "+ max +": ");
        int userResponse = userInput.nextInt();

        if (userResponse >= min && userResponse <= max){
            return userResponse;
        }else {
            System.out.println(userResponse +" is not within the range.");
            return getInteger(min,max);
        }

    }

    public static int getInteger(int min, int max){

        Scanner userInput = new Scanner(System.in);

        int userResponse = min - 1;
        boolean hasLoopRanOnce = false;

        do {

            if (hasLoopRanOnce){
                System.out.println(userResponse +" is not within the range.");
            }

            System.out.print("Enter a number between "+ min +" and "+ max +": ");
            userResponse = userInput.nextInt();

            hasLoopRanOnce = true;

        }while (!(userResponse >= min && userResponse <= max));

        return userResponse;

    }

    public static String getFactorialString(int num){

        String stringToReturn = "";

        for (int i = 1; i <= num; i++){

            if (i == num){
                stringToReturn += i;
            }else {
                stringToReturn += i + " x ";
            }

        }

        return stringToReturn;
    }

    public static int getFactorialSum(int num){

        int sum = 1;

        for (int i = 2; i <= num; i++){

          sum *= i;

        }

        return sum;

    }

    public static void getFactorial(){

        int factorialNumber = getInteger(1,10);

        for (int i = 1; i <= factorialNumber; i++){

//            System.out.printf("%d! = %s = %d\n",i,getFactorialString(i),getFactorialSum(i));
            System.out.printf("%d! =",i);
            System.out.printf(" %-20s",getFactorialString(i));
            System.out.printf("= %d\n",getFactorialSum(i));

        }

    }


    public static void main(String[] args) {

//        System.out.println(Addition(59.38,2.833));
//        System.out.println(Subtraction(10,5.5));
//        System.out.println(Multiplication(7.25,8));
//        System.out.println(Division(120,3));
//        System.out.println(Modulus(120,0));
//
//
//        System.out.println("Your number in the range was " + getInteger(1,100));

        getFactorial();

//        System.out.println(getFactorialString(4));

//        System.out.println(getFactorialSum(3));

    }

}
