package case_study.model.facility;

public abstract class Facility {
    String idService;
    String nameService;
    float area;
    float rentalCosts;
    int maxPeople;
    String typeRent;

    public Facility() {
    }

    public Facility(String idService, String nameService, float area, float rentalCosts, int maxPeople,
                    String typeRent) {
        this.idService = idService;
        this.nameService = nameService;
        this.area = area;
        this.rentalCosts = rentalCosts;
        this.maxPeople = maxPeople;
        this.typeRent = typeRent;
    }

    public String getIdService() {
        return idService;
    }

    public void setIdService(String idService) {
        this.idService = idService;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public float getRentalCosts() {
        return rentalCosts;
    }

    public void setRentalCosts(float rentalCosts) {
        this.rentalCosts = rentalCosts;
    }

    public int getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(int maxPeople) {
        this.maxPeople = maxPeople;
    }

    public String getTypeRent() {
        return typeRent;
    }

    public void setTypeRent(String typeRent) {
        this.typeRent = typeRent;
    }

    @Override
    public String toString() {
        return "FacilityModel{" +
                "idService='" + idService + '\'' +
                ", nameService='" + nameService + '\'' +
                ", area=" + area +
                ", rentalCosts=" + rentalCosts +
                ", maxPeople=" + maxPeople +
                ", typeRent='" + typeRent + '\'' +
                '}';
    }
}
