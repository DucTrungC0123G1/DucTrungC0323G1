package case_study.model.facility;

public class Room extends Facility {
    String serviceFree;

    public Room(String idService, String nameService, float area, float rentalCosts, int maxPeople, String typeRent, String serviceFree) {

        super(idService, nameService, area, rentalCosts, maxPeople, typeRent);
        this.serviceFree = serviceFree;
    }

    public String getServiceFree() {
        return serviceFree;
    }

    public void setServiceFree(String serviceFree) {
        this.serviceFree = serviceFree;
    }

    @Override
    public String toString() {
        return "Room{" +
                "serviceFree='" + serviceFree + '\'' +
                ", idService='" + idService + '\'' +
                ", nameService='" + nameService + '\'' +
                ", area=" + area +
                ", rentalCosts=" + rentalCosts +
                ", maxPeople=" + maxPeople +
                ", typeRent='" + typeRent + '\'' +
                '}';
    }
}
