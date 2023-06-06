package case_study.service;

import case_study.model.facility.Facility;
import case_study.model.facility.House;
import case_study.model.facility.Room;
import case_study.model.facility.Villa;
import case_study.repository.FacilityRepository;
import case_study.service.iml.IFacilityService;
import case_study.ultils.ValidateRegex;

import java.util.Map;

public class FacilityService implements IFacilityService {
    private static FacilityRepository facilityRepository = new FacilityRepository();
    private static Map<Facility, Integer> facilityIntegerMap = facilityRepository.getMap();

    @Override
    public void displayFacility() {
        for (Map.Entry<Facility, Integer> facilityIntegerEntry : facilityIntegerMap.entrySet()) {
            System.out.println(facilityIntegerEntry.getKey() + "-" + facilityIntegerEntry.getValue());
        }
    }

    @Override
    public void addFacility() {
        System.out.println("Choose Add New Facility: \n" +
                "1. Add New Room\n" +
                "2. Add New House\n" +
                "3. Add New Villa\n" +
                "4. Return Menu");
        String choose = sc.nextLine();
        switch (choose) {
            case "1":
                //String idService, String nameService, float area, float rentalCosts, int maxPeople, String typeRent
                // , String serviceFree
                String idServiceRoom = ValidateRegex.checkIdRoom();
                String nameServiceRoom = ValidateRegex.checkName();
                Float areaRoom = ValidateRegex.checkArea();
//                    Float areaRoom1 = Float.parseFloat(areaRoom);
                Float rentalCostRoom = ValidateRegex.checkRental();
                int people = ValidateRegex.checkMaxPeople();
                String typeRent = ValidateRegex.checkTypeRent();
                System.out.println("Enter ServiceFree: ");
                String serviceFree = sc.nextLine();
                Room room = new Room(idServiceRoom, nameServiceRoom, areaRoom, rentalCostRoom, people, typeRent, serviceFree);
                facilityRepository.addNewFacility(room, 0);
                break;
            case "2":
                //String idService, String nameService, float area, float rentalCosts, int maxPeople, String typeRent,
                //                 String houseStandard, int numberFloor
                String idServiceHouse = ValidateRegex.checkIdHouse();
                String nameServiceHouse = ValidateRegex.checkName();
                Float areaHouse = ValidateRegex.checkArea();
                Float rentalHouse = ValidateRegex.checkRental();
                int people1 = ValidateRegex.checkMaxPeople();
                String typeRentHouse = ValidateRegex.checkTypeRent();
                boolean flagHouseStd = true;
                String houseStandard = "";
                do {
                    System.out.println("Choice House Standard : \n" +
                            "1. Standard House\n" +
                            "2. Superior House\n" +
                            "3. Deluxe House\n" +
                            "4. Executive House\n");
                    String choice = sc.nextLine();
                    switch (choice) {
                        case "1":
                            houseStandard = "Standard House";
                            flagHouseStd = false;
                            break;
                        case "2":
                            houseStandard = "Superior House";
                            flagHouseStd = false;
                            break;
                        case "3":
                            houseStandard = "Deluxe House";
                            flagHouseStd = false;
                            break;
                        case "4":
                            houseStandard = "Executive House";
                            flagHouseStd = false;
                            break;
                        default:
                            System.out.println("Choice Again");
                            flagHouseStd = true;
                            break;
                    }
                } while (flagHouseStd);
                String floorHouse = ValidateRegex.checkFloor();
                int floorHouse1 = Integer.parseInt(floorHouse);
                House house = new House(idServiceHouse,nameServiceHouse,areaHouse,rentalHouse,people1,typeRentHouse,
                        houseStandard,floorHouse1);
                facilityRepository.addNewFacility(house,0);
                break;
            //String idService, String nameService, float area, float rentalCosts, int maxPeople, String typeRent,
            //                 String houseStandard, int numberFloor
            case "3":
                //String idService, String nameService, float area, float rentalCosts, int maxPeople, String typeRent,
                //                 String villaStandard, double swimArea, int numberFloor
                String idServiceVilla =ValidateRegex.checkIdVilla();
                String nameServiceVilla = ValidateRegex.checkName();
                Float areaVilla = ValidateRegex.checkArea();
                Float rentalVilla = ValidateRegex.checkRental();
                int peopleVilla = ValidateRegex.checkMaxPeople();
                boolean flagVilla = true;
                String typeRentVilla = ValidateRegex.checkTypeRent();
                String villaStandard= "";
                do {
                    System.out.println("Choice TypeRent Villa\n" +
                            "1. Standard Villa\n" +
                            "2. Superior Villa\n" +
                            "3. Deluxe Villa\n" +
                            "4. Executive Villa\n");
                    String choice = sc.nextLine();
                    switch (choice){
                        case "1":
                            villaStandard = "Standard Villa";
                            flagVilla = false;
                            break;
                        case "2":
                            villaStandard = "Superior Villa";
                            flagVilla= false;
                            break;
                        case "3":
                            villaStandard = "Deluxe Villa";
                            flagVilla = false;
                            break;
                        case "4":
                            villaStandard = "Executive Villa";
                            flagVilla = false;
                            break;
                        default:
                            System.out.println("Choice Again");
                            flagVilla = true;
                            break;
                    }
                }while (flagVilla);
                //String idService, String nameService, float area, float rentalCosts, int maxPeople, String typeRent,
                //                 String villaStandard, double swimArea, int numberFloor
                double swimArea = ValidateRegex.checkArea();
                String floorVilla = ValidateRegex.checkFloor();
                int floorVilla1 = Integer.parseInt(floorVilla);
                Villa villa = new Villa(idServiceVilla,nameServiceVilla,areaVilla,rentalVilla,peopleVilla,typeRentVilla,
                        villaStandard,swimArea,floorVilla1);
                facilityRepository.addNewFacility(villa,0);
                break;
            case "4":
                break;
        }
    }
}
