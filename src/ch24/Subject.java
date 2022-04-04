package ch24;

public class Subject {
    private String SubjectName;
    private int SubjectScore;

    public Subject(String SubjectName, int SubjectScore){
        this.SubjectName = SubjectName;
        this.SubjectScore = SubjectScore;
    }

    public String getSubjectName() {
        return SubjectName;
    }

    public int getSubjectScore() {
        return SubjectScore;
    }
}
