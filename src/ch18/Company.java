package ch18;
//외부에서 생성할 수 없이 유일한 인스턴스만 사용하도록 제한하는 것 = 싱글톤패턴
public class Company {

    private static Company instance = new Company();

    private Company() {}

    public static Company getInstance(){ //일반 메서드인 경우 인스턴스를 생성해야하는데, 이미 인스턴스를 제한적으로 생성하도록 하였기 때문에 static으로 선언해야함.

        if( instance == null){
            instance = new Company();
        }
        return instance;
    }


}
