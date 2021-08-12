package grades;


import util.Input;

import java.util.HashMap;

public class GradesApplication {

    static Input input = new Input();

    public static void main(String[] args) {

        HashMap<String, Student> students = new HashMap<>();

        Student docrob = new Student("Mark");
        docrob.addGrade(78);
        docrob.addGrade(88);
        docrob.addGrade(98);

        Student dorian = new Student("Dorian");
        dorian.addGrade(99);
        dorian.addGrade(93);
        dorian.addGrade(100);

        Student casey = new Student("Casey");
        casey.addGrade(100);
        casey.addGrade(95);
        casey.addGrade(100);

        Student justin = new Student("Justin");
        justin.addGrade(95);
        justin.addGrade(87);
        justin.addGrade(79);

        students.put("madmarcos-codeup", docrob);
        students.putIfAbsent("doriandub", dorian);
        students.putIfAbsent("vegetasrevenge", casey);
        students.putIfAbsent("jreich5", justin);

        commandLineInterface(students);

//        System.out.println(students.keySet());
    }



    public static void commandLineInterface(HashMap<String, Student> students){
        System.out.println("Welcome!\n" +
                "\n" +
                "Here are the GitHub usernames of our students:");

        do {

            for (String key : students.keySet()) {
                System.out.print("|" + key + "| ");
                System.out.println("\n");
            }

            System.out.println("What student would you like to see more information on?\n");

            String userKey = input.getString();

            if (students.containsKey(userKey)) {

                Student currentStudent = students.get(userKey);

                System.out.println("Name: " + currentStudent.getName() + "GitHub Username: " + userKey);
                System.out.println("Current Average: " + currentStudent.getGradeAverage());

            } else {
                System.out.println("Sorry, there's no student with the GitHub username: " + userKey);
            }

            System.out.println("Would you like to see another student?");
        } while (input.yesNo());

        System.out.println("Good bye \\m/");

    }





















}
