package BtnvDay03;

import java.util.Scanner;

public class bai13 {
        public static void main(String[] args) {
            System.out.print("Nập vào số n: ");
            int n = new Scanner(System.in).nextInt();
            int S = 0;
            for (int i = 7; i <= n; i += 7) {
                S += i;
            }
            System.out.println("Trong các số tự nhiên k lớn hơn " + n + " và chia hết cho 7 là: " + S);
        }
}
