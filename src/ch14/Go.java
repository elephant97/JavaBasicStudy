package ch14;

public class Go {

    public static void main(String[] args)
    {
        Student stu01 = new Student("James",5000);
        Student stu02 = new Student("Tomas",10000);
        RideThings Subway = new RideThings(100,"Subway",1200);
        RideThings Bus = new RideThings(2,"Bus", 1000);

        Subway.getRideThings(stu01);
        Bus.getRideThings(stu02);

        stu01.showStudent();
        stu02.showStudent();

        System.out.println(Subway.getRideName()+"의 승객은 "+Subway.getPerson()+"명 이고, 수입은 "+Subway.getPay()+"원 입니다.");
        System.out.println(Bus.getRideName()+"의 승객은 "+Bus.getPerson()+"명 이고, 수입은 "+Bus.getPay()+"원 입니다.");
    }

}
