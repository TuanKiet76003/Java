package ss02_Array.practice;

import java.util.Scanner;

public class inputArrayAndAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Nhập số phần tử của mảng ");
        int number = sc.nextInt();
        int[]myArray = new int[number];
        for (int i = 0 ; i < myArray.length ; i++) {
            System.out.println(" Nhập số phần tử thứ" + i);
            myArray[i] = sc.nextInt();
        }
        System.out.println(" Mảng bạn vừa nhập là ");
        for (int x : myArray ){
            System.out.print(x);
        }
        int sum =0;
        for (int item : myArray){
            sum += item;
        }
        System.out.println(" ");
        System.out.println("Tổng phần tử trong mảng là :" + sum);
        int avg = sum / myArray.length;
        System.out.println("Trung bình cộng là :" +  avg);
        System.out.println("Bình phương các phần tử trong mảng là ");
        for ( int item2 : myArray) {
            int square = item2 * item2;
            System.out.print(square + " , ");
        }
    }
}
