package case_study.ultils;

import case_study.model.person.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteAndReadFileEmployee {
    public static void writeFileEmployee(List<Employee> employees, String Path) {
        File file = new File(Path);
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Employee e : employees) {
                bufferedWriter.write(e.getInfoEmployeeToCsv());
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Lỗi Đọc File");
        }
    }

    public static List<Employee> readFileEmployee(String Path) {
        File file = new File(Path);
        List<Employee> employeeList = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null && !line.equals("")) {
                String[] arrEmployee = line.split(",");
                Employee employee = new Employee(arrEmployee[0], arrEmployee[1], Double.parseDouble(arrEmployee[2]),
                        Double.parseDouble(arrEmployee[3]), arrEmployee[4], arrEmployee[5], arrEmployee[6], arrEmployee[7],
                        Double.parseDouble(arrEmployee[8]));
                employeeList.add(employee);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Lỗi Không Tìm Thấy File");
        } catch (IOException e) {
            System.out.println("Lỗi Đọc File");
        }
        return employeeList;
    }
}
