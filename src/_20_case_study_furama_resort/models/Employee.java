package _20_case_study_furama_resort.models;

public class Employee extends Person {
    private String literacy;  //trình độ học vấn
    private String position;
    private double salary;

    public Employee() {
    }

    public Employee(String literacy, String position, double salary) {
        this.literacy = literacy;
        this.position = position;
        this.salary = salary;
    }

    public Employee(int id, String name, String dateOfBirth, String gender, String idEntityNumber,
                    String phoneNumber, String email, String literacy, String position, double salary) {
        super(id, name, dateOfBirth, gender, idEntityNumber, phoneNumber, email);
        this.literacy = literacy;
        this.position = position;
        this.salary = salary;
    }

    public String getLiteracy() {
        return literacy;
    }

    public void setLiteracy(String literacy) {
        this.literacy = literacy;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" + super.toString()+","+
                "literacy='" + literacy + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}'
               ;
    }

    public String getStringToWrite() {
        return super.getId()+","+super.getName() +","+super.getDateOfBirth()+","+super.getGender()
                +","+super.getIdEntityNumber()+","+super.getPhoneNumber()+","+super.getEmail()+","+this.getLiteracy()
                +","+this.getPosition()+","+this.getSalary();
    }
}
