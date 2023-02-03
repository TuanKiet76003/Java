package ss01_introduction_java.exercise;

import java.util.Scanner;

public class moneyConversion {
    public static void main(String[] args) {
        double VND  = 23000;
        double USD;
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời bạn nhập số tiền cần đổi (USD) ");
        USD = sc.nextDouble();
        double quyDoi = USD * VND;
        System.out.println(" Số tiền bạn muốn chuyển đổi là : " + quyDoi + "VND");
    }
}
