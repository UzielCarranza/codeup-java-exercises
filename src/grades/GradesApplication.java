package grades;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {

    public static void main(String[] args) {
        HashMap<String, Double> students = new HashMap<String, Double>();
        Student student = new Student("John");
        student.addGrade(5);
        student.addGrade(6);
        student.addGrade(10);
        Student student2 = new Student("mike");
        student2.addGrade(5);
        student2.addGrade(5);
        student2.addGrade(5);


        students.put("UzielC", student.getGradeAverage());
        System.out.println("What student would you like to see more information on?");
        Scanner input = new Scanner(System.in);
        String string = input.next();
        if (string.equalsIgnoreCase("UzielC")) {

            System.out.println("average: " + students.get("UzielC"));
        }

    }
}
