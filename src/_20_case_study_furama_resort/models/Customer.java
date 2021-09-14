package _20_case_study_furama_resort.models;

public class Customer extends Person{
    private String typeCustomer;
    private String address;

    public Customer() {
    }

    public Customer(String typeCustomer, String address) {
        this.typeCustomer = typeCustomer;
        this.address = address;
    }

    public Customer(int id, String name, String dateOfBirth, String gender, String idEntityNumber,
                    String phoneNumber, String email, String typeCustomer, String address) {
        super(id, name, dateOfBirth, gender, idEntityNumber, phoneNumber, email);
        this.typeCustomer = typeCustomer;
        this.address = address;
    }

    public String getTypeCustomer() {
        return typeCustomer;
    }

    public void setTypeCustomer(String typeCustomer) {
        this.typeCustomer = typeCustomer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +super.toString() +','+
                "typeCustomer='" + typeCustomer + '\'' +
                ", address='" + address + '\'' +
                "} " ;
    }

    public String getStringToWrite() {
        return super.getId()+","+super.getName() +","+super.getDateOfBirth()+","+super.getGender()
                +","+super.getIdEntityNumber()+","+super.getPhoneNumber()+","+super.getEmail()+","+this.getTypeCustomer()
                +","+this.getAddress();
    }
}
