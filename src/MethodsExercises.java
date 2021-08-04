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

    public static void main(String[] args) {

        System.out.println(Addition(59.38,2.833));
        System.out.println(Subtraction(10,5.5));
        System.out.println(Multiplication(7.25,8));
        System.out.println(Division(120,3));
        System.out.println(Modulus(120,0));


    }

}
