package s19_regex;

import java.util.Scanner;

public class validateEmail {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Nhap email can kiem tra: ");
            Scanner sc = new Scanner(System.in);
            String email = sc.nextLine();
            if (email.matches("[\\w|_]{6,32}@[a-z]{2,12}\\.[a-z]{2,12}")) {
                System.out.println("day la mot email. ");
            } else {
                System.out.println("day khong phai la mot email. ");
            }
        }
    }
}
