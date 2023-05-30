package s15_exception.repository;

import s15_exception.model.Spending;
import s15_exception.model.UniqueIDException;
import s15_exception.ultils.WriteAndReadSpending;
import s15_exception.ultils.WriteAndReadSpendingBinary;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class RepositorySpending implements IRepositorySpending {
    private static String PATH="D:\\CodeGym\\C0323G1_NguyenDucTrung\\Module 2\\untitled\\src\\s15_exception\\data\\Spending.csv";
    private static final String PATH2 = "D:\\CodeGym\\C0323G1_NguyenDucTrung\\Module 2\\untitled\\src\\s15_exception\\data\\Spending.dat";
    //String idSpend, String nameSpend, String daySpend, String moneySpend, String otherSpend
//    private static List<Spending> spendingList = new ArrayList<>();
//    static {
//        spendingList.add(new Spending("SP001", "Electric", "20/12/2023", 50000, "Vượt Mức 1"));
//        spendingList.add(new Spending("SP002", "Water", "12/12/2022", 700000, "Vượt Mức 2"));
//        spendingList.add(new Spending("SP003", "Gas", "05/04/2021", 1000000, "Vượt Mức 3"));
//        spendingList.add(new Spending("SP004", "Internet", "12/12/2012", 50000, "Vượt Mức 1"));
//        spendingList.add(new Spending("SP005", "CableTV", "23/11/2005", 90000, "Vượt Mức 1"));
//        WriteAndReadSpendingBinary.writeSpendingToFile(spendingList,PATH2);
//        List<Spending> spendingList1 = WriteAndReadSpendingBinary.readSpendingFromFileDat(PATH2);
//        for (Spending s : spendingList1) {
//            System.out.println(s);
//        }
//    }

    @Override
    public List<Spending> getAll()  {
        List<Spending> spendingList = new ArrayList<>();
//        spendingList = WriteAndReadSpending.readFileSpendFromCsv(PATH);
        spendingList = WriteAndReadSpendingBinary.readSpendingFromFileDat(PATH2);
        return spendingList;
    }

    @Override

    public void addSpend(Spending spending) {
        List<Spending> spendingList = WriteAndReadSpendingBinary.readSpendingFromFileDat(PATH2);
        spendingList.add(spending);
//        WriteAndReadSpending.writeFileSpendToCsv(spendingList,PATH);
        WriteAndReadSpendingBinary.writeSpendingToFile(spendingList,PATH2);
    }

    @Override
    public Spending getById(String id) {
        List<Spending> spendingList = WriteAndReadSpendingBinary.readSpendingFromFileDat(PATH2);
        for (Spending s : spendingList) {
            if (s.getIdSpend().equals(id)) {
                return s;
            }
        }
        return null;
    }

    @Override
    public void removeSpend(Spending spending) {
        List<Spending> spendingList = WriteAndReadSpendingBinary.readSpendingFromFileDat(PATH2);
        spendingList.remove(spending);
//        WriteAndReadSpending.writeFileSpendToCsv(spendingList,PATH);
        WriteAndReadSpendingBinary.writeSpendingToFile(spendingList,PATH2);
    }

    @Override
    public void editSpend(String id, Spending spending) {
        List<Spending> spendingList = WriteAndReadSpendingBinary.readSpendingFromFileDat(PATH2);
        for (int i = 0; i < spendingList.size(); i++) {
            if (spendingList.get(i).equals(spending)) {
                spendingList.set(i, spending);
//                WriteAndReadSpending.writeFileSpendToCsv(spendingList,PATH);
                WriteAndReadSpendingBinary.writeSpendingToFile(spendingList,PATH2);
            }
        }
    }

    @Override
    public Spending idSearch(String id) {
        List<Spending> spendingList = WriteAndReadSpendingBinary.readSpendingFromFileDat(PATH2);
        for (Spending s : spendingList) {
            if (s.getIdSpend().equals(id)){
                return s;
            }
        }return null;
    }

    @Override
    public void nameSearch(String name) {
        List<Spending> spendingList = WriteAndReadSpendingBinary.readSpendingFromFileDat(PATH2);
//        for (Spending s : spendingList) {
//            if (s.getNameSpend().contains(name)){
//                return s;
//            }
//        }
//        return null;
        boolean flagSearch=true;
        for (int i = 0; i < spendingList.size(); i++) {
            if (spendingList.get(i).getNameSpend().contains(name)){
                System.out.println(spendingList.get(i));
                flagSearch=false;
            }
        }if (flagSearch){
            System.out.println("Không Tìm Thấy Tên");
        }
    }

}
