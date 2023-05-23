package s13_search.repository;

import s13_search.model.Spending;

import java.util.List;

public interface IRepositorySpending {
    List<Spending> getAll();

    void addSpend(Spending spending);

    Spending getById(String id);

    void removeSpend(Spending spending);

    void editSpend(String id, Spending spending);

    void idSearch(String id);

    void nameSearch(String name);
}
