package grades;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {

    public static void main(String[] args) {
        boolean continueApp = true;

        Scanner input = new Scanner(System.in);

        HashMap<String, Student> students = new HashMap<String, Student>();
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


        Student student4 = new Student("Leo Ramirez");
        student4.addGrade(10);
        student4.addGrade(9);
        student4.addGrade(8);

        students.put("UzielC", student);
        students.put("UrielH", student2);
        students.put("John90", student3);
        students.put("LeoR", student4);
        do {
            System.out.println("What student would you like to see more information on?");

//            System.out.println("UzielC     |  UrielH     | John90     |  LeoR     |");
            for (String key: students.keySet()){
                System.out.print(key + "    |    ");
            }
            System.out.println(students.keySet().stream().reduce("", (allNames, currentName) ->{
                return allNames + "\n -> " + currentName;
            }));
            System.out.println("\n");
            String string = input.next();
            if (students.containsKey(string)) {
                System.out.println("Name: " + students.get(string).getName());
                System.out.println("Average: " + students.get(string).getGradeAverage());
                System.out.println("Grades: ");
                students.get(string).getGrades();
                System.out.println("----------------");
            }else{
                System.out.println("Not a correct github name");
            }
            System.out.println("Would you like to keep getting grades?");
            String userResponse = input.next();
            if (userResponse.equalsIgnoreCase("y")){
                continueApp = true;
            } else{
                System.out.println("bye");
                continueApp = false;
            }
        } while (continueApp);

    }
}
