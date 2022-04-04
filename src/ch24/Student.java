package ch24;


import java.util.ArrayList;

public class Student {
    private static int Num = 1000;
    private String StudentName;
    private int StudentNum;
    ArrayList<Subject> SubjectList = new ArrayList<>();
    private double Average;

    public Student(String StudentName){
        this.StudentName = StudentName;
        Num++;
        StudentNum = Num;
    }

    public void AddSubject(String SubjectName, int SubjectScore){
        SubjectList.add(new Subject(SubjectName, SubjectScore));
    }

    public double AverageScore(){
        Average = 0;
        for(int i = 0; i < SubjectList.size(); i++){
            Average += SubjectList.get(i).getSubjectScore();
        }

        return Average/SubjectList.size();
    }

    public void ShowSubjectAll(){
        for(int i = 0; i < SubjectList.size(); i++) {
            System.out.println(SubjectList.get(i).getSubjectName()+ " : " + SubjectList.get(i).getSubjectScore());
        }
    }

    public String getStudentName() {
        return StudentName;
    }

    public int getStudentNum() {
        return StudentNum;
    }
}
