package s10_bt_thêm.repository;

import s10_bt_thêm.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarRepository implements ICarRepository {
    private static List<Car> carList = new ArrayList<>();
    static {
       carList.add(new Car("001","Honda","TienThu","123",123,"123"));
       carList.add(new Car("002","Honda","abc","456",333,"222"));
    }


    @Override
    public List<Car> getCar() {
    return carList;
    }

    @Override
    public void addNewCar(Car car) {
        carList.add(car);

    }
}
