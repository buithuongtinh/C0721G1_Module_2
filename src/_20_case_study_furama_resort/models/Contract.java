package _20_case_study_furama_resort.models;

public class Contract {
    private int contractId;
    private String code;
    private double deposit;
    private double totalPayment;
    private int customerId;

    public Contract() {
    }

    public Contract(int contractId, String code, double deposit, double totalPayment, int customerId) {
        this.contractId = contractId;
        this.code = code;
        this.deposit = deposit;
        this.totalPayment = totalPayment;
        this.customerId = customerId;
    }

    public int getContractId() {
        return contractId;
    }

    public void setContractId(int contractId) {
        this.contractId = contractId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public double getTotalPayment() {
        return totalPayment;
    }

    public void setTotalPayment(double totalPayment) {
        this.totalPayment = totalPayment;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "contractId=" + contractId +
                ", code='" + code + '\'' +
                ", deposit=" + deposit +
                ", totalPayment=" + totalPayment +
                ", customerId=" + customerId +
                '}';
    }
}
