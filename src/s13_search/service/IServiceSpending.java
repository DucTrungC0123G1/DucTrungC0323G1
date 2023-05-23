package s13_search.service;

import s13_search.model.Spending;

public interface IServiceSpending {
    void display();

    void addSpend();

    void delSpend();

    void editSpend();

    void searchById();

    void searchByName();
}
