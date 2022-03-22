package ch14;

public class Student {
    private String StudentName;
    private int Money;


    public Student(String StudentName, int Money)
    {
        this.StudentName = StudentName;
        this.Money = Money;
    }

    public boolean PayMoneyStudent(int Pay)
    {
        if(this.Money < Pay)
        {
            System.out.println(this.StudentName+"학생의 잔고가 부족합니다.");
            return false;
        }
        else
        {
            this.Money -= Pay;
            return true;
        }
    }

    public void showStudent()
    {
        System.out.println(this.StudentName+"님의 남은 돈은 "+this.Money+"원 입니다.");
    }

}
