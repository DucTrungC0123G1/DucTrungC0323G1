package s7_abstract_class_interface;

public abstract class Book{
    private String bookName;
    private String publishCompany;
    private String yearPublish;

    public Book() {
    }

    public Book(String bookName, String publishCompany, String yearPublish) {
        this.bookName = bookName;
        this.publishCompany = publishCompany;
        this.yearPublish = yearPublish;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getPublishCompany() {
        return publishCompany;
    }

    public void setPublishCompany(String publishCompany) {
        this.publishCompany = publishCompany;
    }

    public String getYearPublish() {
        return yearPublish;
    }

    public void setYearPublish(String yearPublish) {
        this.yearPublish = yearPublish;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", publishCompany='" + publishCompany + '\'' +
                ", yearPublish='" + yearPublish + '\'' +
                '}';
    }
}
