package s10_bt_thêm.repository;

import s10_bt_thêm.model.Truck;

import java.util.ArrayList;
import java.util.List;

public class TruckRepository implements ITruckRepository{
    private static List<Truck> truckList =new ArrayList<>();
    static {
        truckList.add(new Truck("T001","Huynhdai","ABc","123","xyz"));
        truckList.add(new Truck("T002","Honda","ABc","123","xyz"));
        truckList.add(new Truck("T003","Kia","ABc","123","xyz"));
    }
    @Override
    public List<Truck> getTruck() {


        return truckList;
    }

    @Override
    public void addNewTruck(Truck truck) {
        truckList.add(truck);
    }

    @Override
    public Truck getByLicenseTruck(String license) {
        for (Truck t : truckList) {
            if (t.getLicensePlate().equals(license)){
                return t;
            }
        }
        return null;
    }

    @Override
    public void removeTruck(Truck truck) {
        truckList.remove(truck);
    }

    @Override
    public void searchTruck(String license) {
        for (int i = 0; i < truckList.size(); i++) {
            if (truckList.get(i).getLicensePlate().equals(license)){
                System.out.println(truckList.get(i));
            }

        }
    }


}
