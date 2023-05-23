package s10_bt_thêm.repository;

import s10_bt_thêm.model.Truck;

import java.util.List;

public interface ITruckRepository {
    List<Truck> getTruck();

    void addNewTruck(Truck truck);


    Truck getByLicenseTruck(String license);

    void removeTruck(Truck truck);

    void searchTruck(String license);
}
