package s10_bt_thêm.model;

public class Truck extends Vehicle {
    private String truckTonnage;

    public Truck() {

    }

    public Truck(String licensePlate, String manufacture, String yearOfManufacture, String owner, String truckTonnage) {
        super(licensePlate, manufacture, yearOfManufacture, owner);
        this.truckTonnage = truckTonnage;
    }

    public String getTruckTonnage() {
        return truckTonnage;
    }

    public void setTruckTonnage(String truckTonnage) {
        this.truckTonnage = truckTonnage;
    }

    @Override
    public String toString() {
        return "Truck{" +"Truck License ="+super.getLicensePlate()+"---"+"Truck Manufacture ="+super.getManufacture()+
                "---"+"Truck YearOfManu = "+super.getYearOfManufacture()+"---"+"Truck Owner = "+ super.getOwner()+"---"+
                "truckTonnage='" + truckTonnage + '\'' +
                '}';
    }
}
