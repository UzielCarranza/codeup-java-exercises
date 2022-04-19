package grades;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {

    public static void main(String[] args) {
        HashMap<String, Double> students = new HashMap<String, Double>();
        Student student = new Student("Uziel Carranza");
        student.addGrade(5);
        student.addGrade(6);
        student.addGrade(10);
        Student student2 = new Student("Uriel Hernandez");
        student2.addGrade(5);
        student2.addGrade(5);
        student2.addGrade(5);

        Student student3 = new Student("John Ceba");
        student3.addGrade(7);
        student3.addGrade(8);
        student3.addGrade(10);

        System.out.println(student.getName());
        students.put("UzielC", student.getGradeAverage());
        students.put("UrielH", student2.getGradeAverage());
        students.put("John90", student3.getGradeAverage());

        boolean continueApp = true;
        do {


            System.out.println("What student would you like to see more information on?");

            System.out.println("UzielC     |  UrielH     | John90");
            Scanner input = new Scanner(System.in);
            String string = input.next();
            if (string.equalsIgnoreCase("UzielC")) {
                System.out.println("name " + student.getName());
                System.out.println("average: " + students.get("UzielC"));
            } else if (string.equalsIgnoreCase("UrielH")) {

                System.out.println("name " + student2.getName());
                System.out.println("average: " + students.get("UrielH"));
            } else if (string.equalsIgnoreCase("John90")) {

                System.out.println("name " + student3.getName());
                System.out.println("average: " + students.get("John90"));
            } else {
                System.out.println("mmmm I need one of the githubUsernames above me...");
                continueApp = false;
            }
            System.out.println("would you like to see another student? y/n");
            String userContinues = input.next();
            if (userContinues.equalsIgnoreCase("yes")) {
                continueApp = true;
            } else {
                System.out.println("Have a nice day");
                continueApp = false;
            }
        } while (continueApp);

    }
}
