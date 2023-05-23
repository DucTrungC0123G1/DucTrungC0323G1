package s10_bt_thêm.service;

import s10_bt_thêm.model.MotorBike;
import s10_bt_thêm.repository.ICarRepository;
import s10_bt_thêm.repository.IMotorRepository;
import s10_bt_thêm.repository.MotorRepository;

import java.security.acl.Owner;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class MotorBikeService implements IMotorBikeService {
   private Scanner sc = new Scanner(System.in);
   private IMotorRepository motorRepository = new MotorRepository();

    @Override
    public void displayMotorBike() {
        List<MotorBike> motorBikeList = motorRepository.getMotor();
        for (MotorBike m : motorBikeList) {
            System.out.println(m);
        }

    }

    //(String licensePlate, String manufacture, String yearOfManufacture, String owner, String capacity)
    @Override
    public void addNewMotorBike() {
        System.out.print("Enter LicenseMotor: ");
        String addLicense = sc.nextLine();
        System.out.print("Enter ManufactureMotor: ");
        String addManufacture = sc.nextLine();
        System.out.print("Enter YearOfManuMotor: ");
        String addYear = sc.nextLine();
        System.out.print("Enter OwnerMotor: ");
        String addOwner = sc.nextLine();
        System.out.print("Enter CapacityMotor: ");
        String addCapacity = sc.nextLine();
        MotorBike motorBike = new MotorBike(addLicense, addManufacture, addYear, addOwner, addCapacity);
        motorRepository.addNewMotor(motorBike);
    }

    @Override
    public void deleteMotor() {
        displayMotorBike();
        System.out.println("Enter LicenseMotor To Delete");
        String licenseDel = sc.nextLine();
        MotorBike motorBike = motorRepository.getByLicenseMotor(licenseDel);
        if (motorBike != null) {
            System.out.println("Do you want delete " + licenseDel + motorBike.getManufacture());
            System.out.println("1. Yes\n" +
                    "2. Cancel");
            int choiceDel = Integer.parseInt(sc.nextLine());
            if (choiceDel == 1) {
                motorRepository.removeMotor(motorBike);
                System.out.println("Delete Success");
            }
        } else {
            System.out.println("LicenseMotor Not Found");
        }
    }

    @Override
    public void searchMotorBike() {
        System.out.println("Enter License MotorBike To Search");
        String licenseMotor = sc.nextLine();
        motorRepository.searchMotor(licenseMotor);
    }
}
