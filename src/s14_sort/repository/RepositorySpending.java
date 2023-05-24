package s14_sort.repository;

import s14_sort.model.Spending;

import java.util.ArrayList;
import java.util.List;

public class RepositorySpending implements IRepositorySpending {
    //String idSpend, String nameSpend, String daySpend, String moneySpend, String otherSpend
    private static List<Spending> spendingList = new ArrayList<>();

    static {
        spendingList.add(new Spending("SP001", "Electric", "20/12/2023", 50000, "Vượt Mức 1"));
        spendingList.add(new Spending("SP002", "Water", "12/12/2022", 700000, "Vượt Mức 2"));
        spendingList.add(new Spending("SP003", "Gas", "05/04/2021", 1000000, "Vượt Mức 3"));
        spendingList.add(new Spending("SP004", "Internet", "12/12/2012", 50000, "Vượt Mức 1"));
        spendingList.add(new Spending("SP005", "CableTV", "23/11/2005", 90000, "Vượt Mức 1"));
    }

    @Override
    public List<Spending> getAll() {
        return spendingList;
    }

    @Override
    public void addSpend(Spending spending) {
        spendingList.add(spending);

    }

    @Override
    public Spending getById(String id) {
        for (Spending s : spendingList) {
            if (s.getIdSpend().equals(id)) {
                return s;
            }
        }
        return null;
    }

    @Override
    public void removeSpend(Spending spending) {
        spendingList.remove(spending);

    }

    @Override
    public void editSpend(String id, Spending spending) {
        for (int i = 0; i < spendingList.size(); i++) {
            if (spendingList.get(i).equals(spending)) {
                spendingList.set(i, spending);
            }
        }
    }

    @Override
    public void idSearch(String id) {
        for (int i = 0; i < spendingList.size(); i++) {
            if (spendingList.get(i).getIdSpend().equals(id)) {
                System.out.println(spendingList.get(i));
            }
        }
    }

    @Override
    public void nameSearch(String name) {
        for (int i = 0; i < spendingList.size(); i++) {
            if (spendingList.get(i).getNameSpend().contains(name)) {
                System.out.println(spendingList.get(i));
            } else {
                System.out.println("Không Tìm Thấy Tên ");
                break;
            }
        }
    }


}
