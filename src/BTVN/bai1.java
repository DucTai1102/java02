package BTVN;
import java.util.Scanner;
    public class bai1 {
        public static void main(String[] args) {
            System.out.println("phương trình ax +b =0 ");
            System.out.print("Nhập a với a khác 0: ");
            float a = new Scanner(System.in).nextFloat();
            System.out.print("Nhập b: ");
            float b = new Scanner(System.in).nextFloat();
            System.out.print("nghiệm của phương trình "+a+" + "+b+"x = 0 là: x = "+ (-b/a));
        }
    }

