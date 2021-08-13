package grades;

import java.util.ArrayList;

public class Student {
    private String studentName;
//    private int studentGrades;

   private ArrayList<Integer> grades;



    public Student(String studentName) {
        this.studentName = studentName;
        grades = new ArrayList<>();
    }

    public static void main(String[] args) {

        Student bob = new Student("Bob");
        bob.addGrade(70);
        bob.addGrade(80);
        bob.addGrade(90);
        System.out.println("This is what bob got as an average " + bob.getGradeAverage());


    }
    public void addGrade(int grade) {
        grades.add(grade);
    }


    public double getGradeAverage() {
        double sum;
        sum = 0;
        // step 1 iterate over grades and calculate sum
        // step 2 return sum / number of grades
        for (int grade: grades) {
            sum+= grade;
        }
        return (sum/grades.size());
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

}
