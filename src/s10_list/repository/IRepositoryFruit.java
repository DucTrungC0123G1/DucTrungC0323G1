package s10_list.repository;

import s10_list.model.Fruit;

import java.util.List;

public interface IRepositoryFruit {
    List<Fruit> getFruit();
    void addNewFruit(Fruit fruit);
}
