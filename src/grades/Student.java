package grades;

import java.util.ArrayList;

public class Student {
    private String Name;
    private ArrayList<Integer> grade;

    public Student(){}
    public Student(String Name) {
        this.Name = Name;
        this.grade = new ArrayList<>();

    }

    // returns the student's name
    public String getName() {

        return this.Name;
    }

    // adds the given grade to the grades property
    public void addGrade(int grades) {
        grade.add(grades);
    }

    public ArrayList<Integer> getGrades(){

        System.out.println(this.grade);
        return this.grade;
    }
    // returns the average of the students grades
    public double getGradeAverage() {
//        int sum = 0;
//        for (Integer num : grade) {
//            sum += num;
//        }
//        return sum / grade.size();
        int totalPoints = this.grade.stream().reduce(0,(sum, currentGradeElement) ->{
            return sum + currentGradeElement;
        });
        return (double) totalPoints / this.grade.size();

    }

}
























