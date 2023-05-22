package s12_java_collection.repository;

import s12_java_collection.model.Fruit;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class RepositoryFruit implements IRepositoryFruit {
    private static Map<String, Fruit> fruitMap = new HashMap<>();

    static {
        Fruit fruit1 = new Fruit("Xoai", "1", "2023", "2024", "VietNam", "2000", "F001");
        Fruit fruit2 = new Fruit("Cam", "1", "2023", "2024", "VietNam", "2000", "F002");
        Fruit fruit3 = new Fruit("Chuoi", "1", "2023", "2024", "VietNam", "2000", "F003");
        fruitMap.put(fruit1.getIdFruit(), fruit1);
        fruitMap.put(fruit2.getIdFruit(), fruit2);
        fruitMap.put(fruit3.getIdFruit(), fruit3);

    }


    @Override
    public Map<String, Fruit> getFruit() {
        return fruitMap;
    }

    @Override
    public void addNewFruit(Fruit fruit) {
        fruitMap.put(fruit.getIdFruit(), fruit);
    }

    @Override
    public boolean editFruit(String id) {
        boolean flag;
        if (fruitMap.containsKey(id)) {
            flag = true;
        } else {
            System.out.println("ID Not Found ");
            flag = false;
        }
        return flag;
    }


    @Override
    public Fruit getById(String id) {
        Set<String> fruitSet = fruitMap.keySet();
        for (String fruit : fruitSet) {
            if (fruitMap.get(fruit).getIdFruit().equals(id)) {
                return fruitMap.get(fruit);
            }
        }
        return null;
    }

    @Override
    public void removeFruit(Fruit fruit) {
        fruitMap.remove(fruit);
    }


//    @Override
//    public Fruit findIDFruit(String idFruit) {
//        for (int i = 0; i < fruitMap.size(); i++) {
//            if (fruitMap.get(i).getIdFruit().equals(idFruit)){
//            }return fruitMap.get(i);
//        }
//        return null;
//    }

}
