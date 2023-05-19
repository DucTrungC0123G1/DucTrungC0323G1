package s11_stack_queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class CheckPrimeNumber {
    public static boolean isPrime(int a) {
        if (a <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static Stack<Integer> isPrimeStack(int a) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 2; i < a; i++) {
            if (isPrime(i)) {
                stack.push(i);
            }
        }
        return stack;

    }

    public static Queue<Integer> isPrimeQueue(int a) {
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 2; i <= a; i++) {
            if (isPrime(i)) {
                queue.add(i);
            }

        }
        return queue;
    }

}
