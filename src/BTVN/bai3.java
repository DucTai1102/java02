package BTVN;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        System.out.print("chiều dài HCN: ");
        float dai = new Scanner(System.in).nextFloat();
        System.out.print("chiều rộng HCN: ");
        float rong = new Scanner(System.in).nextFloat();
        System.out.println("Chu vi hình chữ nhật chiều dài "+ dai+ " chiều rộng "+rong+" là: "+ 2*(dai+rong));
        System.out.println("Dien tich hình chữ nhật chiều dài "+ dai+ " chiều rộng "+rong+" là: "+ (dai*rong));
    }
}