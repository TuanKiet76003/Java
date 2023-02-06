package ss03_Method.exercise;
import java.util.Scanner;

public class findTheCharacter {
    public static void main(String[] args) {
        String chain = "Welcome to Java" ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập một kí tự để đếm ");
        char countChar = sc.next().charAt(0);
        int count = 0;
        for (int i = 0; i < chain.length(); i++) {
            if (countChar == chain.charAt(i)){
                count++;
            }
        }
        System.out.println("So lan xuat hien cua ky tu " + countChar + " la: " + count);
    }
}
