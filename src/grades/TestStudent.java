package grades;

public class TestStudent {

    public static void main(String[] args) {
        Student student = new Student("josh");
        student.addGrade(8);
        student.addGrade(16);
        student.addGrade(45);
        student.getGradeAverage();
        System.out.println(student.getGradeAverage());
    }
}
