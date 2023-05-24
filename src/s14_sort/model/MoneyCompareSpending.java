package s14_sort.model;

import java.util.Comparator;

public class MoneyCompareSpending implements Comparator<Spending> {
    @Override
    public int compare(Spending o1, Spending o2) {
        if (o1.getMoneySpend().compareTo(o2.getMoneySpend()) == 0) {
            return o1.getNameSpend().compareTo(o2.getNameSpend());
        }
        return o1.getMoneySpend().compareTo(o2.getMoneySpend());
    }
}
