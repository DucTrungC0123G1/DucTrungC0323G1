package s10_bt_thêm.repository;

import s10_bt_thêm.model.Car;

import java.util.List;

public interface ICarRepository {
    List<Car> getCar();
    void addNewCar(Car car);

    Car getByLicenseCar(String license);

    void removeCar(Car car);

    void searchCar(String license);
}
