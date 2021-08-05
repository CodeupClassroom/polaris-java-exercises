package lecture_stuff;

public class OOLectureCompleted {
    // explain differences between Class, field, and object
    private String firstName;
    private String lastName;

    public static final int maxFirstNameLength = 50;

    public OOLectureCompleted() {
        // System.out.println("no arg constructor called");
        this("Unknown", "");
    }

    public OOLectureCompleted(String firstName) {
        this(firstName, "");
    }

    public OOLectureCompleted(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public static void main(String[] args) {
        // instantiate an object
        // use a field and print it out
        OOLectureCompleted myObject = new OOLectureCompleted();
        myObject.firstName = "Bob";
        myObject.lastName = "Roberts";
        System.out.println(myObject.firstName);

        // create a method on the class and call it in main
        System.out.println(myObject.getFullName());
        // explain what this method is doing on my object

        // difference between static methods vs. object methods

        // create 2nd object
        OOLectureCompleted myObject2 = new OOLectureCompleted();
        myObject2.firstName = "Sue";
        myObject2.lastName = "Jones";
        System.out.println(myObject.getFullName());
        System.out.println(myObject2.getFullName());
        // explain 2 instances of the class.
        // each with different values for their fields
        // and their own copy of the function that can use its particular fields

        // static vs instance
        // create static field maxFirstNameLength
        // show how both objects can access it
        System.out.println(myObject.maxFirstNameLength);
        System.out.println(myObject2.maxFirstNameLength);
        // now change the static value
        // myObject.maxFirstNameLength = 100;  // ***** COMMENTED OUT SO CONSTANT EXAMPLE COMPILES
        System.out.println(myObject.maxFirstNameLength);
        // what about myobject2?
        System.out.println(myObject2.maxFirstNameLength);
        // show static field access via Class
        // please use Class name to access static fields
        System.out.println(OOLectureCompleted.maxFirstNameLength);

        // warning: be careful when using static fields for shared memory
        // between objects

        // when is a static field ok?
        // when you are sharing constants
        // talk about math.pi
        // and then change our static field to constant
        // and show compile error

        // constructors
        // show a no-arg constructor
        // point out lack of return value

        // add an overloaded constructor using firstName
        // show lack of using this
        OOLectureCompleted tom = new OOLectureCompleted("tom");
        System.out.println(tom.getFullName());
        // fix the constructor using this

        // try to use this in a static method
        // EXPLAIN what is happening
        // this.lastName = "lou";

        // now add a 2 arg constructor and show duplicated code
        // would be better to provide a default for last name in the 1 arg constructor
        // and 2 defaults for the no arg constructor

        // visibility
        // create another class that uses the OOLecture object in main
        // show how you can directly access the public fields
        // point out best practice for encapsulation
        // change fields to private and generate accessors

        // STOP EXPLAIN THE VOID RETURN TYPE (using the setter)

        // what should be public and what should be private
        // when to use protected?
        // when to use package?

        // change visibility of a function like getFullName to package

        // make 2 packages: a myobjects package and a mydemos package
        // move OOLecture to myobjects and MyDemo to mydemos and show visibility problem
        // change visibility to public
        // explain need for packages
    }
}
