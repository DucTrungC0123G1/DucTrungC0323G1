package s5_accsess_modifier;

public class Employee {
    private String employeeName;
    private int telephone;
    private String position;
    //private thể hiện tính bao đóng- ngăn chặn truy cập trực tiếp từ bên ngoài
   private static String companyName;
   static {
        companyName = "ABC";
    }

    public static String getCompanyName() {
        return companyName;
    }
    //static thuộc tính dùng chung cho các đối tượng của lớp.
    // Nếu có private dùng getter để truy cập biến.
    public Employee() {
    }

    public Employee(String employeeName, int telephone, String position) {
        this.employeeName = employeeName;
        this.telephone = telephone;
        this.position = position;
    }
}
