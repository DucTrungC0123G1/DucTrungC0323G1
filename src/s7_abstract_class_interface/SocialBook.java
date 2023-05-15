package s7_abstract_class_interface;

import java.util.ArrayList;
import java.util.List;

public class SocialBook extends Book implements IBook{
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
        return "SocialBook{" +super.getBookName()+","+super.getPublishCompany()+","+super.getYearPublish()+","+
                "author='" + author + '\'' +
                '}';
    }
   static SocialBook socialBook1 = new SocialBook("Facebook","Meta","2000","Mark Zuckerberg");
   static SocialBook socialBook2 = new SocialBook("Instagram","Ins","2000","ABC");
   static SocialBook socialBook3 = new SocialBook("Twitter","Twit","2000","XYZ");

    @Override
    public void displayBook() {
        SocialBook [] socialBooks = new SocialBook[3];
        socialBooks [0]= socialBook1;
        socialBooks [1] = socialBook2;
        socialBooks [2] = socialBook3;
        for (SocialBook s : socialBooks) {
            System.out.println(s);
        }

    }
}
