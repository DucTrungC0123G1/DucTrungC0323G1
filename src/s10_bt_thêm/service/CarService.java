package s10_bt_thêm.service;

import s10_bt_thêm.model.Car;
import s10_bt_thêm.repository.CarRepository;
import s10_bt_thêm.repository.ICarRepository;

import java.util.List;
import java.util.Scanner;

public class CarService implements ICarService {
   private Scanner sc = new Scanner(System.in);
   private ICarRepository carRepository = new CarRepository();


    @Override
    public void displayCar() {
        List<Car> carList = carRepository.getCar();
        for (Car c : carList) {
            System.out.println(c);
        }
    }

    //String licensePlate, String manufacture, String yearOfManufacture, String owner,int numberSeat, String typeCar
    @Override
    public void addNewCar() {
        System.out.print("Enter New LicensePlateCar : ");
        String newLicense = sc.nextLine();
        System.out.print("Enter New Manufacture : ");
        String newManufacture = sc.nextLine();
        System.out.print("Enter New YearOfManufacture : ");
        String newYear = sc.nextLine();
        System.out.print("Enter New Owner : ");
        String newOwner = sc.nextLine();
        System.out.print("Enter New NumberSeat : ");
        int newNumber = Integer.parseInt(sc.nextLine());
        System.out.print("Enter New TypeCar : ");
        String newTypeCar = sc.nextLine();
        Car car = new Car(newLicense, newManufacture, newYear, newOwner, newNumber, newTypeCar);
        carRepository.addNewCar(car);
        System.out.println("Thêm Thành Công");

    }

    @Override
    public void deleteCar() {
        displayCar();
        System.out.println("Enter LicenseCar To Delete ");
        String licenseDel = sc.nextLine();
        Car car = carRepository.getByLicenseCar(licenseDel);
        if (car != null) {
            System.out.println("Do you want delete " + licenseDel + " --- " + car.getTypeCar());
            System.out.println("1. Yes \n" +
                    "2. Cancel.");
            int choiceDel = Integer.parseInt(sc.nextLine());
            if (choiceDel == 1) {
                carRepository.removeCar(car);
                System.out.println("Delete Success");
            }

        } else {
            System.out.println("License Not Found");
        }
    }

    @Override
    public void searchCar() {
        System.out.println("Enter License To Search");
        String licenseSearch = sc.nextLine();
        carRepository.searchCar(licenseSearch);

    }
}
