package BtnvDay03;

import java.util.Scanner;

public class bai14 {
    public static void main(String[] args) {
        System.out.print("Nhâp số tự nhiên n: ");
        int n = new Scanner(System.in).nextInt();
        System.out.println("các số chẵn nhỏ hơn"+ n+" là: ");
        for(int i = 0;i<=n ;i+=2){
            System.out.println(i);
        }
        System.out.println("các số lẻ nhỏ hơn "+n+" là: ");
        for(int i = 1; i<=n;i+=2){
            System.out.println(i);
        }
    }
}
