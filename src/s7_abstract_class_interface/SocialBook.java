package s7_abstract_class_interface;

import java.util.ArrayList;
import java.util.List;

public class SocialBook extends Book implements IBook {
    private String author;

    public SocialBook() {
    }

    public SocialBook(String bookName, String publishCompany, String yearPublish, String author) {
        super(bookName, publishCompany, yearPublish);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "SocialBook{" + super.getBookName() + "," + super.getPublishCompany() + "," + super.getYearPublish() + "," +
                "author='" + author + '\'' +
                '}';
    }

    @Override
    public void displayBook() {
        System.out.println("SocialBook: " + toString());
    }
}
