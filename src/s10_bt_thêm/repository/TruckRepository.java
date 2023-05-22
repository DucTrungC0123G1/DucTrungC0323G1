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
}
