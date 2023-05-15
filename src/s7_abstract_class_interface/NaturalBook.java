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
        return "NaturalBook{" +super.getBookName()+","+super.getPublishCompany()+","+super.getYearPublish()+","+
                "quantityPublish=" + quantityPublish +
                '}';
    }

    static NaturalBook naturalBook = new NaturalBook("ABC", "Kim Đồng", "2000", 1000);
    static NaturalBook naturalBook1 = new NaturalBook("Tiếng Việt", "Kim Đồng", "2000", 5000);
    static NaturalBook naturalBook2 = new NaturalBook("Toán", "Kim Đồng", "2000", 3000);


    @Override
    public void displayBook() {
        NaturalBook[] naturalBook0 = new NaturalBook[3];
        naturalBook0[0] = naturalBook;
        naturalBook0[1] = naturalBook1;
        naturalBook0[2] = naturalBook2;
        for (NaturalBook n : naturalBook0) {
            System.out.println(n);
        }
    }
}
