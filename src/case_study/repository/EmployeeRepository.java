package case_study.repository;

import case_study.model.person.Employee;
import case_study.repository.iml.IEmployeeRepository;
import case_study.ultils.WriteAndReadFileEmployee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements IEmployeeRepository {
    private static final String PATH_EMPLOYEE = "D:\\CodeGym\\C0323G1_NguyenDucTrung\\Module 2\\untitled\\src\\case_study" +
            "\\data\\Employee.csv";
//   private static List<Employee> employeeList = new ArrayList<>();
//    static {
//        employeeList.add(new Employee("Trung","11/04/1993",201615558,1223450089,
//                "Trung@gmail.com","NV-0001","Collage","Reception",10000000));
//
//    }

    @Override
    public List<Employee> getAll() {
        List<Employee> employeeList = WriteAndReadFileEmployee.readFileEmployee(PATH_EMPLOYEE);
        return employeeList;
    }

    @Override
    public void addNewEmployee(Employee employee) {
        List<Employee> employeeList = WriteAndReadFileEmployee.readFileEmployee(PATH_EMPLOYEE);
        employeeList.add(employee);
        WriteAndReadFileEmployee.writeFileEmployee(employeeList, PATH_EMPLOYEE);
    }
    @Override
    public Employee getById(String id) {
        List<Employee> employeeList = WriteAndReadFileEmployee.readFileEmployee(PATH_EMPLOYEE);
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getIdEmployee().equals(id)){
                return employeeList.get(i);
            }
        }return null;
    }

    @Override
    public void editEmployee(String id, Employee employee) {
        List<Employee> employeeList = WriteAndReadFileEmployee.readFileEmployee(PATH_EMPLOYEE);
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getIdEmployee().equals(id)){
                employeeList.set(i,employee);
                WriteAndReadFileEmployee.writeFileEmployee(employeeList,PATH_EMPLOYEE);
            }
        }
    }
}
