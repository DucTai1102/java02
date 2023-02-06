package BtnvDay03;

import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        System.out.print("Nhập vào số Nguyên n: ");
        int n = new Scanner(System.in).nextInt();
        int num = 2;
        int count = 0;
        System.out.println(n + " Số nguyên tố đầu tiên là: ");
        while (count != n) {
            boolean mark = true;
            for (int i = 2; i < Math.sqrt(num); i++) {
                if (num % i == 0) {
                    mark = false;
                    break;
                }
            }
            if (mark) {
                System.out.println(num);
                count++;
            }
            num++;
        }
    }
}
