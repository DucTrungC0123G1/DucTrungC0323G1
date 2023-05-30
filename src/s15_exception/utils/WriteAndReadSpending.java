package s15_exception.utils;

import s15_exception.model.Spending;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteAndReadSpending {
    static public void writeFileSpendToCsv(List<Spending>spendingList,String Path){
        File file = new File(Path);
        try{
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            for (Spending s : spendingList) {
                bw.write(s.getInfoSpendToFileCsv());
                bw.newLine();
            }
            bw.flush();
            bw.close();
            fw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    static public List<Spending> readFileSpendFromCsv(String path){
        File file =new File(path);
        List<Spending> spendingList =new ArrayList<>();
        try{
            FileReader fr= new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line = null;
            while((line=br.readLine())!=null&&!line.equals("")){
                String[]arrSpend =line.split(",");
                //String idSpend, String nameSpend, String daySpend, Integer moneySpend, String otherSpend
                Spending spending = new Spending(arrSpend[0],arrSpend[1],arrSpend[2],Integer.parseInt(arrSpend[3]),arrSpend[4]);
                spendingList.add(spending);

            }
            br.close();
            fr.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return spendingList;

    }
}
