package BtnvDay03;

import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        System.out.print("Nhập vào 1 số nguyên dương: ");
        String num = new Scanner(System.in).nextLine();
        for (int i = 0; i < (num.length() / 2); i++) {
            if (num.charAt(i) != num.charAt(num.length() - 1 - i)) {
                System.out.println(num + "Không là số thuận nghịch");
                return;
            }
        }
        System.out.println(num + "Là số thuận Nghịc");
    }
}
