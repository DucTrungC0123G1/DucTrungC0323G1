package s7_abstract_class_interface;

public class MainTest {
    public static void main(String[] args) {

        Book naturalBook = new NaturalBook("Math", "KimDong", "2000", 5000);
        Book socialBook = new SocialBook("Facebook", "Meta", "2000", "Mark");
        Book[] arrBooks = {naturalBook, socialBook};
        for (Book b : arrBooks) {
            b.displayBook();
        }

    }
}
