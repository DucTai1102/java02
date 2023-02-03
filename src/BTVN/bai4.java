package BTVN;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) throws ParseException {
        System.out.print("nhập vào sinh nhật (VD: 02/06/1999): " );
        String birthDay = new Scanner(System.in).nextLine();
        Date dateNow = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date birthDayConverted = simpleDateFormat.parse(birthDay);
        System.out.println("tuổi của bạn là: "+ (dateNow.getYear()-birthDayConverted.getYear()));
    }
}