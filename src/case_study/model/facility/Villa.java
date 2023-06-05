package case_study.model.facility;

public class Villa extends FacilityModel{
    String villaStandard;
    double swimArea;
    int numberFloor;

    public Villa(String idService, String nameService, float area, float rentalCosts, int maxPeople, String typeRent,
                 String villaStandard, double swimArea, int numberFloor) {
        super(idService, nameService, area, rentalCosts, maxPeople, typeRent);
        this.villaStandard = villaStandard;
        this.swimArea = swimArea;
        this.numberFloor = numberFloor;
    }

    public String getVillaStandard() {
        return villaStandard;
    }

    public void setVillaStandard(String villaStandard) {
        this.villaStandard = villaStandard;
    }

    public double getSwimArea() {
        return swimArea;
    }

    public void setSwimArea(double swimArea) {
        this.swimArea = swimArea;
    }

    public int getNumberFloor() {
        return numberFloor;
    }

    public void setNumberFloor(int numberFloor) {
        this.numberFloor = numberFloor;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "villaStandard='" + villaStandard + '\'' +
                ", swimArea=" + swimArea +
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
