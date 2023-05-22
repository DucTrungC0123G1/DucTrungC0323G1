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
        return "MotorBike{" +
                "capacity='" + capacity + '\'' +
                '}';
    }
}
