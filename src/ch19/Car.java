package ch19;

public class Car {

    private static int SerialNum = 1000;
    private int CarNum;


    public Car() {
        SerialNum++;
        CarNum = SerialNum;
    }

    public int getCarNum() {
        return CarNum;
    }
}
