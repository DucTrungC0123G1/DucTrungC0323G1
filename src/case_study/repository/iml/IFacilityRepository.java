package case_study.repository.iml;

import case_study.model.facility.Facility;

import java.util.Map;

public interface IFacilityRepository {

    Map<Facility, Integer> getMap();


    void addNewFacility(Facility facility , int numb);
}
