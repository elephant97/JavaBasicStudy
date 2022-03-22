package Project01;

public class Delivery {
    public String Name;
    public int Age;
    public int OrderNum;
    public int PhoneNum;
    public String address;
    public int Date;
    public int Time;
    public int Pay;
    public int MenuNum;


    public void Delivery(String Name, int Age){
        this.Name = Name;
        this.Age = Age;
        System.out.println(this.Name+"("+Age+"세) 의 주문이 접수되었습니다.");
    }
    public void order(){
        System.out.println("음식점에 주문이 들어왔습니다.");
        System.out.println();
    }
}
