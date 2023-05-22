package s10_bt_thêm.service;

import s10_bt_thêm.model.MotorBike;
import s10_bt_thêm.repository.ICarRepository;
import s10_bt_thêm.repository.IMotorRepository;
import s10_bt_thêm.repository.MotorRepository;

import java.util.List;

public class MotorBikeService implements IMotorBikeService {
    IMotorRepository motorRepository= new MotorRepository();
    @Override
    public void displayMotorBike() {
        List<MotorBike> motorBikeList = motorRepository.getMotor();
        for (MotorBike m : motorBikeList) {
            System.out.println(m);
        }

    }

    @Override
    public void addNewMotorBike() {

    }
}
