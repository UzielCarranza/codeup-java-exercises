import grades.Student;

import java.util.HashMap;

public class GradesApplication {

    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<String, Student>();
        Student student = new Student("John");
        student.addGrade(5);
        student.addGrade(6);
        student.addGrade(10);
        Student student2 = new Student("mike");
        student2.addGrade(5);
        student2.addGrade(5);
        student2.addGrade(5);


        students.put("UzielC:", student);
        students.put("UzielCarranza", student2);
        System.out.println(students.get("UzielC:"));

    }
}
