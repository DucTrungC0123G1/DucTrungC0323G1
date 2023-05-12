package s5_accsess_modifier;

public class Employee {
    private String employeeName;
    private int telephone;
    private String position;
    //private thể hiện tính bao đóng- ngăn chặn truy cập trực tiếp từ bên ngoài
    static String companyName;
    static {
        companyName = "ABC";
    }
    //static thuộc tính dùng chung cho các đối tượng của lớp
    public Employee() {
    }

    public Employee(String employeeName, int telephone, String position) {
        this.employeeName = employeeName;
        this.telephone = telephone;
        this.position = position;
    }
}
