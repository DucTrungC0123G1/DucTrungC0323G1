package s10_bt_thêm.service;

import s10_bt_thêm.model.Car;
import s10_bt_thêm.repository.CarRepository;
import s10_bt_thêm.repository.ICarRepository;

import java.util.List;
import java.util.Scanner;

public class CarService implements ICarService {
    Scanner sc = new Scanner(System.in);
    ICarRepository carRepository = new CarRepository();


    @Override
    public void displayCar() {
        List<Car>carList  = carRepository.getCar();
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
        Car car= new Car(newLicense,newManufacture,newYear,newOwner,newNumber,newTypeCar);
        carRepository.addNewCar(car);
        System.out.println("Thêm Thành Công");

    }
}
