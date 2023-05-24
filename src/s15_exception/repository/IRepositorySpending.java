package s15_exception.repository;

import s15_exception.model.Spending;

import java.util.List;

public interface IRepositorySpending {
    List<Spending> getAll();

    void addSpend(Spending spending);

    Spending getById(String id);

    void removeSpend(Spending spending);

    void editSpend(String id, Spending spending);

    Spending idSearch(String id);

    Spending nameSearch(String name);



}
