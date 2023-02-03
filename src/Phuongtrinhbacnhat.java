import java.util.Scanner;

public class Phuongtrinhbacnhat {
    public static void main(String[] args) {
        System.out.print("nhap a: ");
        int a = new Scanner(System.in).nextInt();
        System.out.print("nhap vao b: ");
        int b = new Scanner(System.in).nextInt();
        System.out.printf("nghiem cua pt la: %.3f",(float)-b/a);
    }
}