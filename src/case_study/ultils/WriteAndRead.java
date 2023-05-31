package case_study.ultils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteAndRead {
    public static List<String> readFile(String path){
        List<String> stringList = new ArrayList<>();
        try{
            FileReader fileReader = new FileReader(path);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line= bufferedReader.readLine())!=null){
                stringList.add(line);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File Không Tìm Thấy");
        } catch (IOException e) {
            System.out.println("Lỗi Đọc File");
        }
        return stringList;
    }
    public static void writeFile(List<String>stringList,String path, boolean append){
        try {
            FileWriter fileWriter = new FileWriter(path,append);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (String s:stringList) {
                bufferedWriter.write(s);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println("Lỗi Đọc File");
        }
    }

}
