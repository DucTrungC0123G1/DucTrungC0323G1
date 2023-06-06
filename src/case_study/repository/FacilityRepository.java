package case_study.repository;

import case_study.model.facility.Facility;
import case_study.model.facility.House;
import case_study.model.facility.Room;
import case_study.model.facility.Villa;
import case_study.repository.iml.IFacilityRepository;

import java.util.LinkedHashMap;
import java.util.Map;

public class FacilityRepository implements IFacilityRepository {
    private static LinkedHashMap<Facility, Integer> facilityIntegerLinkedHashMap;

    //String idService, String nameService, float area, float rentalCosts, int maxPeople, String typeRent,
//                 String houseStandard, int numberFloor
    //String idService, String nameService, float area, float rentalCosts, int maxPeople, String typeRent, String serviceFree
    //String idService, String nameService, float area, float rentalCosts, int maxPeople, String typeRent,
    //                 String villaStandard, double swimArea, int numberFloor
    static {
        facilityIntegerLinkedHashMap = new LinkedHashMap<>();
        facilityIntegerLinkedHashMap.put(new House("SVHO-0001", "House1", 200, 500, 10,
                "High", "Free", 4), 0);
        facilityIntegerLinkedHashMap.put(new Room("SVRO-0001", "Room1", 100, 200, 5,
                "Medium", "Free"), 0);
        facilityIntegerLinkedHashMap.put(new Villa("SVVL-0001", "Villa1", 150, 300, 8,
                "High", "Standard", 50, 3), 0);
    }


    @Override
    public Map<Facility, Integer> getMap() {
        return facilityIntegerLinkedHashMap;
    }

    @Override
    public void addNewFacility(Facility facility, int numb) {
        facilityIntegerLinkedHashMap.put(facility,numb);

    }


}
