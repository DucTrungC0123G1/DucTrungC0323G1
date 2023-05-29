package case_study.model.facility;

public class House extends FacilityModel{
    String houseStandard;
    int numberFloor;

    public House(String idService, String nameService, double area, double rentalCosts, int maxPeople, String typeRent,
                 String houseStandard, int numberFloor) {
        super(idService, nameService, area, rentalCosts, maxPeople, typeRent);
        this.houseStandard = houseStandard;
        this.numberFloor = numberFloor;
    }

    public String getHouseStandard() {
        return houseStandard;
    }

    public void setHouseStandard(String houseStandard) {
        this.houseStandard = houseStandard;
    }

    public int getNumberFloor() {
        return numberFloor;
    }

    public void setNumberFloor(int numberFloor) {
        this.numberFloor = numberFloor;
    }

    @Override
    public String toString() {
        return "House{" +
                "houseStandard='" + houseStandard + '\'' +
                ", numberFloor=" + numberFloor +
                ", idService='" + idService + '\'' +
                ", nameService='" + nameService + '\'' +
                ", area=" + area +
                ", rentalCosts=" + rentalCosts +
                ", maxPeople=" + maxPeople +
                ", typeRent='" + typeRent + '\'' +
                '}';
    }
}
