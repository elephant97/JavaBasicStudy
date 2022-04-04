package ch24;

public class ScoreProject {
    public static void main(String[] args) {
        Student student1 = new Student("Lee");
        Student student2 = new Student("Kim");

        student1.AddSubject("국어",100);
        student1.AddSubject("수학",50);

        student2.AddSubject("국어",70);
        student2.AddSubject("수학",85);
        student2.AddSubject("영어",100);

        System.out.println(student1.getStudentNum()+" 학번 "+student1.getStudentName()+" 학생의 평균점수: "+ student1.AverageScore());
        System.out.println("전체 과목의 점수 목록");
        student1.ShowSubjectAll();

        System.out.println();
        System.out.println(student2.getStudentNum()+" 학번 "+student2.getStudentName()+" 학생의 평균점수: "+ student2.AverageScore());
        System.out.println("전체 과목의 점수 목록");
        student2.ShowSubjectAll();
    }
}
