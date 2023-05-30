package case_study.repository;

import case_study.model.person.Employee;

import java.util.List;

public interface IEmployeeRepository {
    List<Employee> getAll();

    void addNewEmployee(Employee employee);

    Employee getById(String id);

    void editEmployee(String id, Employee employee);
}
