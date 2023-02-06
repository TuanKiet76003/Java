package ss03_Method.exercise;

import java.util.Scanner;

public class totalDiagonalOfMatrix {
    public static void main(String[] args) {
        int number ; // số bậc của ma trận
        int sum = 0 ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số bậc của ma trận");
        number = sc.nextInt();
        int arr [][] = new int[number][number];
        System.out.println("Nhập các phần tử cho ma trận");
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                System.out.print("A[" + i + "]["+ j + "] = ");
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(" ma trận vừa nhập là ");
        for (int i = 0; i < number ; i++) {
            for (int j = 0; j < number ; j++) {
                System.out.println( arr [i] [j] + "\t");
            }
            System.out.println("\n");
        }
        // các phần tử nằm trên đường chéo chính
        // là các phần tử có chỉ số dòng = chỉ số cột
        System.out.println(" ");
        for (int i = 0; i < number ; i++) {
            for (int j = 0; j < number ; j++) {
                if (i == j){
                    sum += arr[i][j];
                }
            }
        }
        System.out.println(" ");
        System.out.println("Tổng các phần tử nằm trên đường chéo chính = " + sum);
    }
}
