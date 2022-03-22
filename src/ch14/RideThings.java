package ch14;

public class RideThings {

    private String RideName;
    private int Pay;
    private int Person;
    boolean isValid;
    private int balance;
    private int num;

    public RideThings(int num, String RideName, int Pay)
    {
        this.RideName = RideName;
        this.Pay = Pay;
        this.num = num;
    }

    public void getRideThings(Student student)
    {
        if(this.RideName.equals("Subway"))
        {
            isValid=student.PayMoneyStudent(this.Pay);
        }
        else if(this.RideName.equals("Bus"))
        {
            isValid=student.PayMoneyStudent(this.Pay);
        }
        else
        {
            System.out.println(this.RideName+"이라는 탈 것이 존재하지 않습니다.");
        }

        getRidePerson(isValid);
    }

    public void getRidePerson(boolean isValid)
    {
        if(isValid == true)
        {
            this.Person++;
            this.balance += this.Pay;
        }
    }

    public int getPay()
    {
        return this.balance;
    }

    public int getPerson()
    {
        return this.Person;
    }

    public String getRideName()
    {
        if(this.RideName.equals("Subway"))
        {
            return this.num+"번 지하철";
        }
        else if(this.RideName.equals("Bus"))
        {
            return this.num+"번 버스";
        }
        else
        {
            return "ERROR";
        }

    }

}
