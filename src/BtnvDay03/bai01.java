package BtnvDay03;

import java.util.Scanner;

public class bai01 {
    public static void main(String[] args) {
        System.out.print("nhap a: ");
        int a = new Scanner(System.in).nextInt();
        System.out.print("nhap b: ");
        int b = new Scanner(System.in).nextInt();
        System.out.print("nhap c: ");
        int c = new Scanner(System.in).nextInt();
        System.out.print("nhap d: ");
        int d = new Scanner(System.in).nextInt();

        if (a >= b && a >= c && a >= d) {
            System.out.println(a + " La so lon nhat");
        } else if (b >= a && b >= c && b >= d) {
            System.out.println(b + " La so lon nhat");
        } else if (c >= a && c >= b && c >= d) {
            System.out.println(c + " La so lon nhat");
        } else {
            System.out.println(d + " La so lon nhat");
        }
    }
}
