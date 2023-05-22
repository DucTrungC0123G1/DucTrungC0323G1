package s10_bt_thêm.model;

public abstract class Vehicle {
    private String licensePlate;
    private String manufacture;
    private String yearOfManufacture;
    private String owner;

    public Vehicle(String licensePlate, String manufacture, String yearOfManufacture, String owner) {
        this.licensePlate = licensePlate;
        this.manufacture = manufacture;
        this.yearOfManufacture = yearOfManufacture;
        this.owner = owner;
    }

    public Vehicle() {

    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public String getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(String yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "licensePlate='" + licensePlate + '\'' +
                ", manufacture='" + manufacture + '\'' +
                ", yearOfManufacture='" + yearOfManufacture + '\'' +
                ", owner='" + owner + '\'' +
                '}';
    }
}
