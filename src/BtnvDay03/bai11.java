package BtnvDay03;

import java.util.Scanner;

public class bai11 {
    public static void main(String[] args) {
        System.out.print("nhap so tu nhien n: ");
        int n = new Scanner(System.in).nextInt();
        long S, S1 = 0, S2;
        S = (long)n * (n + 1) / 2;
        for (int i = 1; i <= n; i += 2) {
            S1 += i;
        }
        S2 = S - S1;
        System.out.println(" Tổng các chữ số tự nhiên nhỏ hơn " + n + " là: " + S);
        System.out.println(" Tổng các chữ số lẻ tự nhiên nhỏ hơn" + n + " là: " + S1);
        System.out.println(" Tổng các chữ số chẵn tự nhiên nhỏ hơn" + n + " là: " + S2);
    }
}
