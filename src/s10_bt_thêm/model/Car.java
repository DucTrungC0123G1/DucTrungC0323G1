package s10_bt_thêm.model;

public class Car extends Vehicle{
    private int numberSeat;
    private String typeCar;

    public Car(String licensePlate, String manufacture, String yearOfManufacture, String owner,int numberSeat, String typeCar) {
        super(licensePlate, manufacture, yearOfManufacture, owner);
        this.numberSeat = numberSeat;
        this.typeCar = typeCar;
    }

    public int getNumberSeat() {
        return numberSeat;
    }

    public void setNumberSeat(int numberSeat) {
        this.numberSeat = numberSeat;
    }

    public String getTypeCar() {
        return typeCar;
    }

    public void setTypeCar(String typeCar) {
        this.typeCar = typeCar;
    }

    @Override
    public String toString() {
        return "Car{" + super.getLicensePlate()+","+super.getManufacture()+","+super.getYearOfManufacture()+","+
                super.getOwner()+","+
                "numberSeat=" + numberSeat +
                ", typeCar='" + typeCar + '\'' +
                '}';
    }
}
