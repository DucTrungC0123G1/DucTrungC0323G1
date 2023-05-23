package s10_bt_thêm.repository;

import s10_bt_thêm.model.MotorBike;

import java.util.List;

public interface IMotorRepository {
    List<MotorBike> getMotor();

    void addNewMotor(MotorBike motorBike);


    MotorBike getByLicenseMotor(String license);

    void removeMotor(MotorBike motorBike);

    void searchMotor(String license);
}
