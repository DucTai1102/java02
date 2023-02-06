package BtnvDay03;

import java.util.Scanner;

public class bai12 {
    public static void main(String[] args) {
        System.out.println(" Nhập 2 chữ số m,n cho m<n");
        System.out.print(" Nhập m: ");
        int m = new Scanner(System.in).nextInt();
        System.out.print(" Nhập n: ");
        int n = new Scanner(System.in).nextInt();
        int count = 0;
        System.out.println(" Các số chính phương trong đoạn [" + m + ";" + n + "] là: ");
        for (int i = m; i <= n; i++) {
            int canI = (int) Math.sqrt(i);
            if (Math.pow(canI, 2) == i) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println("Có " + count + " Các số chính phương trong đoạn [" + m + ";" + n + "]");
    }
}
