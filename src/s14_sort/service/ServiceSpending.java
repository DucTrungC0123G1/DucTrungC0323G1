package s14_sort.service;

import s14_sort.model.MoneyCompareSpending;
import s14_sort.model.Spending;
import s14_sort.repository.IRepositorySpending;
import s14_sort.repository.RepositorySpending;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ServiceSpending implements IServiceSpending {
    private Scanner sc = new Scanner(System.in);
    private IRepositorySpending repositorySpending = new RepositorySpending();
    private List<Spending> spendingList = repositorySpending.getAll();

    @Override
    public void display() {
        List<Spending> spendingList = repositorySpending.getAll();
        for (Spending s : spendingList) {
            System.out.println(s);
        }

    }

    //String idSpend, String nameSpend, String daySpend,
// String moneySpend, String otherSpend
    @Override
    public void addSpend() {
        System.out.print("Nhập Mã Chi Tiêu: ");
        String id = sc.nextLine();
        System.out.print("Nhập Tên Chi Tiêu: ");
        String name = sc.nextLine();
        System.out.print("Nhập NgàyChi Tiêu: ");
        String day = sc.nextLine();
        System.out.print("Nhập Tiền Chi Tiêu: ");
        Integer money = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập Mô Tả Chi Tiêu: ");
        String other = sc.nextLine();
        Spending spending = new Spending(id, name, day, money, other);
        repositorySpending.addSpend(spending);
        System.out.println("Nhập Thành Công");
    }

    @Override
    public void delSpend() {
        display();
        boolean flag= false;
        do {
            System.out.println("Nhập Mã Bạn Muốn Xóa");
            String idDel = sc.nextLine();
            Spending spending = repositorySpending.getById(idDel);
            if (spending != null) {
                System.out.println("Bạn Có Muốn Xóa: " + spending + "--" + spending.getNameSpend());
                System.out.println("1.Có\n" +
                        "2.Không\n");
                int choice = Integer.parseInt(sc.nextLine());
                if (choice == 1) {
                    repositorySpending.removeSpend(spending);
                    System.out.println("Bạn Đã Xóa Thành Công");
                }
            } else {
                System.out.println("Không Tìm Thấy Mã");
                flag = true;
            }
        }while (flag);

    }

    //String idSpend, String nameSpend, String daySpend,
// String moneySpend, String otherSpend
    @Override
    public void editSpend() {
        display();
        System.out.print("Nhập Mã Id Muốn Sửa:");
        String idEdit = sc.nextLine();
        Spending spending = repositorySpending.getById(idEdit);
        if (spending != null) {
            System.out.print("Sửa ID: ");
            spending.setIdSpend(sc.nextLine());
            System.out.print("Sửa Tên: ");
            spending.setNameSpend(sc.nextLine());
            System.out.print("Sửa Ngày: ");
            spending.setDaySpend(sc.nextLine());
            System.out.print("Sửa Tiền: ");
            spending.setMoneySpend(Integer.parseInt(sc.nextLine()));
            System.out.print("Sửa Thêm: ");
            spending.setOtherSpend(sc.nextLine());
            repositorySpending.editSpend(idEdit, spending);
        }
    }

    @Override
    public void searchById() {
        System.out.print("Nhập Id Để Tìm Kiếm: ");
        String idSearch = sc.nextLine();
        repositorySpending.idSearch(idSearch);
    }

    @Override
    public void searchByName() {
        System.out.print("Nhập Tên Để Tìm Kiếm: ");
        String nameSearch = sc.nextLine();
        if (repositorySpending.nameSearch(nameSearch)==null){

        }
    }

    @Override
    public void sortName() {
        System.out.println("Sắp xếp Theo Tên Chi Tiêu");
        Collections.sort(spendingList);
        for (Spending s : spendingList) {
            System.out.println(s);
        }
    }

    @Override
    public void sortMoney() {
        System.out.println("Sắp Xếp Theo Tiền Chi Tiêu");
        Collections.sort(spendingList, new MoneyCompareSpending());
        for (Spending s : spendingList) {
            System.out.println(s);
        }
    }


}
