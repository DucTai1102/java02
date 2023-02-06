package BtnvDay03;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        System.out.print(" Nhập số a: ");
        int a = new Scanner(System.in).nextInt();
        System.out.print(" Nhập số b: ");
        int b = new Scanner(System.in).nextInt();
        int aCopy = a, bCopy = b;
        while (aCopy != bCopy) {
            int temp;
            if (aCopy > bCopy) {
                temp = bCopy;
                bCopy = aCopy - bCopy;
                aCopy = temp;
            } else {
                temp = aCopy;
                aCopy = bCopy - aCopy;
                bCopy = temp;
            }
        }
        System.out.println("UCLN cua " + a + " va " + b + " la: " + a);
        System.out.println("BCNN cua " + a + " va " + b + " la: " + (a * b / aCopy));
    }
}
