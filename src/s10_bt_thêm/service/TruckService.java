package s10_bt_thêm.service;

import s10_bt_thêm.model.Truck;
import s10_bt_thêm.repository.CarRepository;
import s10_bt_thêm.repository.ICarRepository;
import s10_bt_thêm.repository.ITruckRepository;
import s10_bt_thêm.repository.TruckRepository;

import java.util.ArrayList;
import java.util.List;

public class TruckService implements ITruckService{
    ITruckRepository truckRepository= new TruckRepository();
    @Override
    public void displayTruck() {
        List<Truck> truckList= truckRepository.getTruck();
        for (Truck t:truckList) {
            System.out.println(t);
        }

    }

    @Override
    public void addNewTruck() {

    }
}
