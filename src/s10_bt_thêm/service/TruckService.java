package s10_bt_thêm.service;

import s10_bt_thêm.model.Truck;
import s10_bt_thêm.repository.CarRepository;
import s10_bt_thêm.repository.ICarRepository;
import s10_bt_thêm.repository.ITruckRepository;
import s10_bt_thêm.repository.TruckRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TruckService implements ITruckService {
    private Scanner sc = new Scanner(System.in);
    private ITruckRepository truckRepository = new TruckRepository();

    @Override
    public void displayTruck() {
        List<Truck> truckList = truckRepository.getTruck();
        for (Truck t : truckList) {
            System.out.println(t);
        }

    }

    //String licensePlate, String manufacture, String yearOfManufacture, String owner, String truckTonnage
    @Override
    public void addNewTruck() {
        System.out.print("Enter LicenseTruck: ");
        String addLicense = sc.nextLine();
        System.out.print("Enter ManufactureTruck: ");
        String addManufacture = sc.nextLine();
        System.out.print("Enter YearOfManuTruck: ");
        String addYear = sc.nextLine();
        System.out.print("Enter OwnerTruck: ");
        String addOwner = sc.nextLine();
        System.out.print("Enter TonnageTruck: ");
        String addTonnage = sc.nextLine();
        Truck truck = new Truck(addLicense, addManufacture, addYear, addOwner, addTonnage);
        truckRepository.addNewTruck(truck);
    }

    @Override
    public void deleteTruck() {
        displayTruck();
        System.out.print("Enter LicenseTruck To Delete: ");
        String licenseDel = sc.nextLine();
        Truck truck = truckRepository.getByLicenseTruck(licenseDel);
        if (truck != null) {
            System.out.println("Do you want delete " + truck + "--" + truck.getManufacture());
            System.out.println("1. Yes \n" +
                    "2. Cancel.");
            int choiceDel = Integer.parseInt(sc.nextLine());
            if (choiceDel == 1) {
                truckRepository.removeTruck(truck);
                System.out.println("Delete Success");
            }
        } else {
            System.out.println("License Not Found");
        }
    }

    @Override
    public void searchTruck() {
        System.out.println("Enter LicenseTruck To Search");
        String licenseTruck = sc.nextLine();
        truckRepository.searchTruck(licenseTruck);
    }
}
