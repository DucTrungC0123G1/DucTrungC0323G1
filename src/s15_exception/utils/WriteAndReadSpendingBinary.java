package s15_exception.utils;

import s15_exception.model.Spending;

import java.io.*;
import java.util.List;

public class WriteAndReadSpendingBinary {
    public static void writeSpendingToFile(List<Spending> spendingList, String path2){
        try{
            FileOutputStream fileOutputStream = new FileOutputStream(path2);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(spendingList);
            objectOutputStream.flush();
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static List<Spending> readSpendingFromFileDat(String path2) {
        List<Spending> spendingList = null;
        try {
            FileInputStream fileInputStream = new FileInputStream(path2);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            spendingList = (List<Spending>) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
        } catch (IOException e) {
            System.out.println("File rong");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return spendingList;

    }

}
