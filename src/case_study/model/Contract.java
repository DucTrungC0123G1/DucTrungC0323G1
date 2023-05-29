package case_study.model;

public class Contract {
    String idContract;
    String idBooking;
    double deposit;
    double totalPayMoney;

    public Contract() {
    }

    public Contract(String idContract, String idBooking, double deposit, double totalPayMoney) {
        this.idContract = idContract;
        this.idBooking = idBooking;
        this.deposit = deposit;
        this.totalPayMoney = totalPayMoney;
    }

    public String getIdContract() {
        return idContract;
    }

    public void setIdContract(String idContract) {
        this.idContract = idContract;
    }

    public String getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(String idBooking) {
        this.idBooking = idBooking;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public double getTotalPayMoney() {
        return totalPayMoney;
    }

    public void setTotalPayMoney(double totalPayMoney) {
        this.totalPayMoney = totalPayMoney;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "idContract='" + idContract + '\'' +
                ", idBooking='" + idBooking + '\'' +
                ", deposit=" + deposit +
                ", totalPayMoney=" + totalPayMoney +
                '}';
    }
}
