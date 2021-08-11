import java.util.Arrays;

public class ArraysExercises {

    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(numbers);
//        System.out.println(Arrays.toString(numbers));

        Person[] people = new Person[3];

        people[0] = new Person("Ry");
        people[1] = new Person("Sam");
        people[2] = new Person("Dorian");

        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i].getName());
        }

        people = addPerson(people, new Person("Mark"));

        System.out.println("With added Person");

        // ENHANCED FOR LOOP IS READ ONLY AND NO ACCESS TO INDEX
        for (Person person : people) {
            System.out.println(person.getName());
        }

    }

        public static Person[] addPerson(Person[] people, Person personToAdd) {
            Person[] newPeopleArray = Arrays.copyOf(people, people.length + 1);

            newPeopleArray[newPeopleArray.length -1] = personToAdd;

            return newPeopleArray;
        }
}
