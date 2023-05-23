package s10_bt_thêm.model;

public class MotorBike extends Vehicle{
    private String capacity;

    public MotorBike() {
    }

    public MotorBike(String licensePlate, String manufacture, String yearOfManufacture, String owner, String capacity) {
        super(licensePlate, manufacture, yearOfManufacture, owner);
        this.capacity = capacity;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "MotorBike :{"+ "Motor License: "+ super.getLicensePlate()+"---"+"Motor Manufacture: "+super.getManufacture()+
                "---"+"Motor YearOfManu: "+super.getYearOfManufacture()+"---"+"Motor Owner: "+super.getOwner()+"---"+
                "Motor Capacity :"+capacity+"}";
    }
}
