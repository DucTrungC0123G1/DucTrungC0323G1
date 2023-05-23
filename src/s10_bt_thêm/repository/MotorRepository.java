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

    @Override
    public void addNewMotor(MotorBike motorBike) {
        motorBikeList.add(motorBike);

    }

    @Override
    public MotorBike getByLicenseMotor(String license) {
        for (MotorBike m : motorBikeList) {
            if (m.getLicensePlate().equals(license))
                return m;
        }
        return null;
    }

    @Override
    public void removeMotor(MotorBike motorBike) {
        motorBikeList.remove(motorBike);
    }

    @Override
    public void searchMotor(String license) {
        for (int i = 0; i <motorBikeList.size(); i++) {
            if (motorBikeList.get(i).getLicensePlate().equals(license)){
                System.out.println(motorBikeList.get(i));
            }

        }
    }


}
