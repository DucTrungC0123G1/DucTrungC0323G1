package s11_stack_queue;

import java.util.Scanner;

import static s11_stack_queue.CheckPrimeNumber.isPrimeQueue;
import static s11_stack_queue.CheckPrimeNumber.isPrimeStack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Các Số Nguyên Tố Bé Hơn N - Nhập N");
        int n = Integer.parseInt(sc.nextLine());
        System.out.println("Sử dụng bằng Stack: ");
        for (Integer i : isPrimeStack(n)) {
            System.out.println(i);
        }
        System.out.println("Sử dụng bằng Queue: ");
        for (Integer i : isPrimeQueue(n)) {
            System.out.println(i);
        }
    }
}
