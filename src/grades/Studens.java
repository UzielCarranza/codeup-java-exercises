package grades;

public class Studens {

    public static void main(String[] args) {
        Student student = new Student("josh");
        student.addGrade(8);
        student.addGrade(16);
        student.addGrade(45);
        System.out.println(student.getGradeAverage());
    }
}
