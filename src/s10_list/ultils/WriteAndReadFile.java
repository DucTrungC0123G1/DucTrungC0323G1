package s10_list.ultils;

import s10_list.model.Fruit;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteAndReadFile {
    public static void writeFileFruitToCsv(List<Fruit> fruitList, String path) {
        File file = new File(path);
        try {
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            for (Fruit f : fruitList) {
                bw.write(f.getFileFruitToCsv());
                bw.newLine();
            }
            bw.flush();
            bw.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Fruit> readFileFruitFromCsv(String path) {
        File file = new File(path);
        List<Fruit> fruitList = new ArrayList<>();
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line = null;
            while ((line = br.readLine()) != null && !line.equals("")) {
                String[] fruitArr = line.split(",");
                Fruit fruit = new Fruit(fruitArr[0], fruitArr[1], fruitArr[2], fruitArr[3], fruitArr[4], fruitArr[5]);
                fruitList.add(fruit);
            }
            br.close();
            fr.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return fruitList;
    }

}
