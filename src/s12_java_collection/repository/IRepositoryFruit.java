package s12_java_collection.repository;

import s12_java_collection.model.Fruit;

import java.util.List;
import java.util.Map;

public interface IRepositoryFruit   {

    Map<String,Fruit> getFruit();

    void addNewFruit(Fruit fruit);

    boolean editFruit(String id);

    Fruit getById(String id);

    void removeFruit(Fruit fruit);
//    Fruit findIDFruit(String idFruit);


}
