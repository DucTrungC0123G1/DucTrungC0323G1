package s10_bt_thêm.repository;

import s10_bt_thêm.model.MotorBike;

import java.util.ArrayList;
import java.util.List;

public class MotorRepository implements IMotorRepository {
    private static List<MotorBike> motorBikeList = new ArrayList<>();
    static {
        motorBikeList.add(new MotorBike("M001","Honda","2003","ABc","150cc"));
        motorBikeList.add(new MotorBike("M002","YAmaha","2003","ABc","150cc"));
        motorBikeList.add(new MotorBike("M003","Suzuki","2003","ABc","150cc"));
    }
    @Override
    public List<MotorBike> getMotor() {

        return motorBikeList;
    }
}
