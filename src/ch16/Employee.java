package ch16;

public class Employee {

    private static int serialNum = 1000;

    private int employeeId;
    private String employeeName;
    private String department;

    public Employee(){
        serialNum++;
        employeeId = serialNum;
    }

    public static int getSerialNum() { //static class안에서는 인스턴스 변수 사용 불가
        int i = 0;

        return serialNum;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getDepartment() {
        return department;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
