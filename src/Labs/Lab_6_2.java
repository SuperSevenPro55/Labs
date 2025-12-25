package Labs;

import java.util.Scanner;


public class Lab_6_2 {
    public static void start() {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long w = sc.nextLong();  // Ввод данных
        long h = sc.nextLong();

        long left = 0;
        long right = Math.max(w, h) * n; // В худшем случае (все в ряд)

        while (left < right) {
            long mid = left + (right - left) / 2;

            long new_w = w / mid;
            long new_h = h / mid;


        }
    }
}
