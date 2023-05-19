package s7_abstract_class_interface;

import java.util.ArrayList;
import java.util.List;

public class NaturalBook extends Book implements IBook {
    private int quantityPublish;

    public NaturalBook() {
    }

    public NaturalBook(String bookName, String publishCompany, String yearPublish, int quantityPublish) {
        super(bookName, publishCompany, yearPublish);
        this.quantityPublish = quantityPublish;
    }

    public int getQuantityPublish() {
        return quantityPublish;
    }

    public void setQuantityPublish(int quantityPublish) {
        this.quantityPublish = quantityPublish;
    }

    @Override
    public String toString() {
        return "NaturalBook{" + super.getBookName() + "," + super.getPublishCompany() + "," + super.getYearPublish() + "," +
                "quantityPublish=" + quantityPublish +
                '}';
    }

    @Override
    public void displayBook() {
        System.out.println("NaturalBook: " + toString());
    }
}
