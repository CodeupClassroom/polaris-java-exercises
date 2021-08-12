package grades;

import java.util.ArrayList;

public class Student {

    private String name;
    private ArrayList<Integer> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addGrade(int grade) {
        this.grades.add(grade);
    }

    public double getGradeAverage(){
        double sum = 0;
        for (Integer grade : this.grades) {
            sum += grade;
        }
        return sum / this.grades.size();
    }

//    public static void main(String[] args) {
//
//
//        Student sam = new Student("Sam");
//        sam.addGrade(57);
//        sam.addGrade(67);
//        sam.addGrade(77);
//
//        System.out.println(sam.getGradeAverage());
//
//
//    }


















}
