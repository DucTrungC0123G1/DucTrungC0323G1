package s13_search.model;

public class Spending {
    private String idSpend;
    private String nameSpend;
    private String daySpend;
    private String moneySpend;
    private String otherSpend;

    public Spending() {
    }

    public Spending(String idSpend, String nameSpend, String daySpend, String moneySpend, String otherSpend) {
        this.idSpend = idSpend;
        this.nameSpend = nameSpend;
        this.daySpend = daySpend;
        this.moneySpend = moneySpend;
        this.otherSpend = otherSpend;
    }

    public String getIdSpend() {
        return idSpend;
    }

    public void setIdSpend(String idSpend) {
        this.idSpend = idSpend;
    }

    public String getNameSpend() {
        return nameSpend;
    }

    public void setNameSpend(String nameSpend) {
        this.nameSpend = nameSpend;
    }

    public String getDaySpend() {
        return daySpend;
    }

    public void setDaySpend(String daySpend) {
        this.daySpend = daySpend;
    }

    public String getMoneySpend() {
        return moneySpend;
    }

    public void setMoneySpend(String moneySpend) {
        this.moneySpend = moneySpend;
    }

    public String getOtherSpend() {
        return otherSpend;
    }

    public void setOtherSpend(String otherSpend) {
        this.otherSpend = otherSpend;
    }

    @Override
    public String toString() {
        return "Spending{" +
                "idSpend='" + idSpend + '\'' +
                ", nameSpend='" + nameSpend + '\'' +
                ", daySpend='" + daySpend + '\'' +
                ", moneySpend='" + moneySpend + '\'' +
                ", otherSpend='" + otherSpend + '\'' +
                '}';
    }
}
