package ss03_Method.exercise;

import java.util.Scanner;

public class minElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Nhập số lượng phần tử");
        int number = sc.nextInt();
        int [] arrayNumber = new int[number];
        for (int i = 0; i < number; i++) {
            System.out.println("Nhập phần tử thứ " + i + "trong mảng");
            arrayNumber[i] = sc.nextInt();
        }
        System.out.println("Mảng đã nhập là ");
        for(int  x : arrayNumber){
            System.out.print( x);
        }
        int min = arrayNumber[0];
        for (int i = 0; i < arrayNumber.length; i++) {
            if (min > arrayNumber[i]){
                min = arrayNumber[i];
            }
        }
        System.out.println(" ");
        System.out.println("Giá trị nhỏ nhất của mảng là " + min);
    }
}
