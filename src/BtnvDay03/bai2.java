package BtnvDay03;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        System.out.print("Nhap vao so tu nhien n: ");
        int n = new Scanner(System.in).nextInt();
        if (n == 0) {
            System.out.println("So 0 co vo so uoc");
            return;
        }
        int count = 0;
        System.out.println("cac uoc cua " + n + " la:");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
                System.out.println(i);
            }
        }
        System.out.println("so uoc cua "+n+" la:"+count);
    }
}
