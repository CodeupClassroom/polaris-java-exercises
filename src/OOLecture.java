import person.Person;

public class OOLecture {

    public static void main(String[] args) {
        Person bob = new Person();
        // bob.firstName = "bob";
        bob.setFirstName("Bob");
        bob.setLastName("smith");
        Person sue = new Person();
        sue.setFirstName("Sue");
        sue.setLastName("Jones");

        System.out.println(bob.getFirstName());
        System.out.println(sue.getFullName());

        Person.abbreviateFirstName("Bob");

//        System.out.println(bob.MAX_FIRSTNAME_LENGTH);
//        System.out.println(sue.MAX_FIRSTNAME_LENGTH);
//        bob.MAX_FIRSTNAME_LENGTH = 100;
//
//        System.out.println(bob.MAX_FIRSTNAME_LENGTH);
//        System.out.println(sue.MAX_FIRSTNAME_LENGTH);

        Person tom = new Person("tom", "smith");
        System.out.println(tom.getFullName());
    }
}
