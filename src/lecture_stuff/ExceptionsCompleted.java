package lecture_stuff;

import person.Person;

import java.util.Arrays;

public class ExceptionsCompleted {

    // let's say getRecord returns an Object representing a database record
    // if there are a few different types of errors that we want to tell the caller about
    // how would we return that. E.g., some possible errors are:
    //      record with recordId does not exist
    //      database is offline
    //      unable to login to the database
    public Object getRecord(int recordId) {
        return null;
    }

    public static void main(String[] args) {
        // intro exceptions

        // show using error code as return value and problems

        // show index out of bounds exception
        int [] a1 = {1, 2, 3, 4, 5};
        // System.out.println(a1[999]); // causes an exception

        // manually throw a runtime exception and print afterwards
        // throw new RuntimeException("hi there!");
        // System.out.println("After the exception");

        // handle the above exception with a try/catch
//        try {
//            throw new RuntimeException("hi there!");
//        } catch(RuntimeException e) {
//            System.out.println("I caught an exception: " + e.getMessage());
//        }
//        System.out.println("After the exception");

        // do the math example
        // int result = 1 / 0;
//        try {
//            System.out.println("Let's see...");
//            int result = 1 / 0;
//            System.out.println("I can divide by zero!");
//        } catch (ArithmeticException e) {
//            System.out.println("Math still works!");
//        }

        // show a finally as part of Exception handler

        // show try/catch/finally SCOPE

        // show printStackTrace

        // introduce Exception compared to RuntimeException
        //  Exceptions are checked, RuntimeExceptions are unchecked

        // passing the buck with throws
        // create a function foo
        // throw an Exception
        // handle it with try/catch and then handle it with throws

        // difference between checked and unchecked
            // uncle bob's preference
            // highlight THROWS shows up in auto-complete/micro-help

        // mention Error class

        // custom exceptions
            // useful for providing a multi-exception container
            // only have to try/catch it, and can dig deeper if we want to find out what specifically happened
        // have meaningful exception messages!!!

        // exception best practices
            // use meaningful exception messages
            // create well-named application specific exceptions
            // use unchecked exceptions
            //      and let caller decide if they want to try/catch it or throw it
            // a try/catch is complicated enough to be its own function
            // don't try/catch everything. use throws if you want the caller to deal with the error
            //      BUT don't be a wimp!!! this should be a design decision

        // make BadInputException
        // make a function that calls getInt in Input
        // make a Main class that calls that function until it gets back a valid choice
        //

    }
}
