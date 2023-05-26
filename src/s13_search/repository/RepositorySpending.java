package s13_search.repository;

import s13_search.model.Spending;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class RepositorySpending implements IRepositorySpending {
    //String idSpend, String nameSpend, String daySpend, String moneySpend, String otherSpend
    private static List<Spending> spendingList = new ArrayList<>();

    static {
        spendingList.add(new Spending("SP001", "Tiền Điện", "20/12/2023", "500000", "Vượt Mức 1"));
        spendingList.add(new Spending("SP002", "Tiền Nước", "12/12/2022", "700000", "Vượt Mức 2"));
        spendingList.add(new Spending("SP003", "Tiền Gas", "05/04/2021", "1000000", "Vượt Mức 3"));
        spendingList.add(new Spending("SP004", "Tiền Internet", "12/12/2012", "120000", "Vượt Mức 1"));
        spendingList.add(new Spending("SP005", "Tiền CableTV", "23/11/2005", "99000", "Vượt Mức 1"));
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
    public Spending idSearch(String id) {
        for (Spending s : spendingList) {
            if (s.getIdSpend().equals(id)){
                return s;
            }
        }
        return null;
    }


    @Override
    public void nameSearch(String name) {
//        for (Spending s : spendingList) {
//            if (s.getNameSpend().contains(name)){
//                return s;
//            }
//        }
        boolean flagSearch = true;
        for (int i = 0; i < spendingList.size(); i++) {
            if (spendingList.get(i).getNameSpend().contains(name)){
                System.out.println(spendingList.get(i));
                flagSearch = false;
            }
        }
        if (flagSearch){
            System.out.println("Không Tìm Thấy");
        }
    }
}





