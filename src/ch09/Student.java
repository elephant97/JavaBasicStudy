package ch09;

public class Student {

    int studentId;
    String StudentName;

    Subject korea;
    Subject math;

    Student(int studentId, String StudentName){
        this.studentId = studentId;
        this.StudentName = StudentName;

        korea = new Subject();
        math = new Subject();
    }

    public void setKoreaSubject(String name, int score){
        korea.subjectName = name;
        korea.score = score;
    }

    public void setMathSubject(String name, int score){
        math.subjectName = name;
        math.score = score;
    }

    public void showScoreInfo(){
        int total = korea.score + math.score;
        System.out.println(StudentName + "학생의 총점은 " + total +"점 입니다.");
    }
}
