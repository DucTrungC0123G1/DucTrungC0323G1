package s10_list.repository;

import s10_list.model.Fruit;
import s10_list.service.ServiceFruit;
import s10_list.ultils.WriteAndReadFile;

import java.util.ArrayList;
import java.util.List;

public class RepositoryFruit implements IRepositoryFruit {
    private static final String PATH = "D:\\CodeGym\\C0323G1_NguyenDucTrung\\Module 2\\untitled\\src\\s10_list\\file\\fruit.csv";

    private List<Fruit> fruitList = new ArrayList<>();
//    static {
//        Fruit fruit1 = new Fruit("Cam","1","20/11/2020","30/11/2020","China","20000");
//        Fruit fruit2 = new Fruit("Oi","1","20/11/2020","30/11/2020","China","20000");
//        Fruit fruit3 = new Fruit("Xoai","1","20/11/2020","30/11/2020","China","20000");
//        fruitList.add(fruit1);
//        fruitList.add(fruit2);
//        fruitList.add(fruit3);
//    }
    @Override
   public List<Fruit> getFruit() {
        fruitList = WriteAndReadFile.readFileFruitFromCsv(PATH);
        return fruitList;
    }

    @Override
    public void addNewFruit(Fruit fruit) {
        fruitList.add(fruit);
        WriteAndReadFile.writeFileFruitToCsv(fruitList, PATH);
    }
}
