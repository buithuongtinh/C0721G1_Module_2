package bai_lam_them_fix_bug;

public class Employee extends Person {
    private int salary;
    public Employee(int salary,String name, int AGE, Address address) {
        super(name, AGE, address);
        this.salary =salary;
    }

    @Override
    public void howToMove() {
        System.out.println("Employee by motorbike or car");
    }

}
