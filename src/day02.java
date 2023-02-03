import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class day02 {
    
    public static void main(String[] agrs) throws ParseException {
        String birthday = "2000/06/02";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd");
        Date ngaysinh = simpleDateFormat.parse(birthday);

        Date NgayHienTai = new Date();
        System.out.println(NgayHienTai.getYear()-ngaysinh.getYear());

        Scanner sc = new Scanner(System.in);
        System.out.println("Chiều dài của HCN:");
        int ChieuDai = sc.nextInt();
        System.out.println("Chiều rộng của HCN");
        int ChieuRong = sc.nextInt();
        System.out.println("Diện tích của Hình chữ nhật là "+(ChieuRong*ChieuDai));

        System.out.println("xin mời nhập tên của bạn:" );
        String s = new Scanner(System.in).nextLine();
        System.out.println(s);









    };

    

}
