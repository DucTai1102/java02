package BtnvDay03;

import java.util.Scanner;

public class bai06 {
    public static void main(String[] args) {
        System.out.print("Nhập vào số nguyên: ");
        int num = new Scanner(System.in).nextInt();
        int S = 0;
        int numCopy = num;
        while (numCopy > 0) {
            int modNum = numCopy % 10;
            S += modNum;
            numCopy /= 10;
        }
        System.out.println("Tổng các chữ số" + num + " llà: " + S);
    }
}
