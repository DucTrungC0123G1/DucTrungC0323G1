package case_study.service.iml;

import case_study.model.facility.Facility;

import java.util.Scanner;

public interface IFacilityService {
    Scanner sc = new Scanner(System.in);
    void displayFacility();


    void addFacility();
}
