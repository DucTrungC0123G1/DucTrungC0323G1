package s13_search.service;

import s13_search.model.Spending;
import s13_search.repository.IRepositorySpending;
import s13_search.repository.RepositorySpending;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ServiceSpending implements IServiceSpending {
    private Scanner sc = new Scanner(System.in);
    private IRepositorySpending repositorySpending = new RepositorySpending();

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
        String money = sc.nextLine();
        System.out.print("Nhập Mô Tả Chi Tiêu: ");
        String other = sc.nextLine();
        Spending spending = new Spending(id, name, day, money, other);
        repositorySpending.addSpend(spending);
        System.out.println("Nhập Thành Công");
    }

    @Override
    public void delSpend() {
        display();
        System.out.println("Nhập Mã Bạn Muốn Xóa");
        String idDel = sc.nextLine();
        Spending spending = repositorySpending.getById(idDel);
        if (spending != null) {
            System.out.println("Bạn Có Muốn Xóa: " + spending + "--" + spending.getNameSpend());
            System.out.println("1.Có\n" +
                    "2.Không");
            int choice = Integer.parseInt(sc.nextLine());
            if (choice == 1) {
                repositorySpending.removeSpend(spending);
                System.out.println("Bạn Đã Xóa Thành Công");
            }
        } else {
            System.out.println("Không Tìm Thấy Mã");
        }
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
            spending.setMoneySpend(sc.nextLine());
            System.out.print("Sửa Thêm: ");
            spending.setOtherSpend(sc.nextLine());
            repositorySpending.editSpend(idEdit, spending);
        }
    }

    @Override
    public void searchById() {
        System.out.print("Nhập Id Để Tìm Kiếm: ");
        String idSearch = sc.nextLine();
        if (repositorySpending.idSearch(idSearch) == null) {
            System.out.println("Không tìm thấy ID");
        } else {
            System.out.println(repositorySpending.idSearch(idSearch));
        }
    }

    @Override
    public void searchByName() {
        System.out.print("Nhập Tên Để Tìm Kiếm: ");
        String nameSearch = sc.nextLine();
        if (repositorySpending.nameSearch(nameSearch) == null) {
            System.out.println("Không Tìm Thấy Tên");
        } else {
            System.out.println(repositorySpending.nameSearch(nameSearch));
        }
    }
}
