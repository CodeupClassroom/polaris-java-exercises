import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {

        //Declaring an Array:
//        int[] anArray = new int[10];

        //Instantiating an Array:
//        int numberOfElements = 10;

        //Instantiating an Array with a Variable:
//        int[] anArray = new int[numberOfElements];

        //Assigning values to the index of an Array:
//        int[] numbers = new int[3];
//        numbers[0] = 1;
//        numbers[1] = 2;


        //Default Values and Common Errors:
//        System.out.println(numbers[0]); // 1
//        System.out.println(numbers[1]); // 2
//        System.out.println(numbers[2]); // 0 -- default value
//        System.out.println(numbers[3]); // ArrayIndexOutOfBoundsException !!!



        //Getting the length of an Array:
//        int[] anArray = {1,2,3,4,5,6};

//        System.out.println(anArray.length);



        //Looping through an array with an enhanced for loop:
//        String[] languages = {"html", "css", "javascript", "java"};

        //Example of Enhanced for loop:
        //for(dataType item : array) {}

//        for (String language : languages) {
//            System.out.println(language);
//        }



        //Example of Arrays.fill():
//        int[] scoreCard = {2, 2, 1, 8, 3, 2, 2, 4, 2};

//        Arrays.fill(scoreCard, 0);

//        System.out.println("Score Card has been reset \n" + Arrays.toString   (scoreCard));


        //Example of Arrays.copyOf():
//        int[] org = new int[] {1,2,3};
//        System.out.println("Original Array");
//
//        int[] copy = Arrays.copyOf(org, 5);
//
//            copy[3] = 11;
//            copy[4] = 55;
//
//        System.out.println(Arrays.toString(copy));



        //Mark's code example of Arrays.toString():
//        int [] a1 = {1, 2, 3, 4, 5};
//
//        System.out.println(Arrays.toString(a1));
//
//        a1 = Arrays.copyOf(a1, 10);
//
//        System.out.println(Arrays.toString(a1));
//
//        a1 = Arrays.copyOf(a1, 3);
//
//        System.out.println(Arrays.toString(a1));



        //Example of Arrays.sort():
//        int[] arr = {13, 7, 6, 45, 21, 9, 101, 102};
//        Perform the function
//        Arrays.sort(arr);
//        Print it out using print format
//        System.out.printf("Modified arr[] : %s",
//        Arrays.toString(arr));


        // 1st Example of 2 Dimensional Arrays:
//        int[][] matrix = {
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9}
//        };

//        System.out.println(matrix[0][2]); // 3
//        System.out.println(matrix[1][1]); // 5
//        System.out.println(matrix[2][0]); // 7



        //2nd Example of 2 Dimensional Arrays:
//        String[][] names = {
//                {"Mr. ", "Mrs. ", "Ms. "},
//                {"Smith", "Jones"}
//        };
//        System.out.println(names[0][0] + names[1][0]);
//        System.out.println(names[0][2] + names[1][1]);





        //3rd Example of a 2 Dimensional Array:
//        int[][] matrix = {
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9}
//        };
//        Example of an enhanced for loop:

//        for(dataType item : array) {
//...
//        }

//        for (int[] row : matrix) {
//            System.out.println();
//
//            for (int column : row) {
//                System.out.print(column + " | ");
//            }
//        }





    }
}
