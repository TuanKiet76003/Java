package ss03_method.exercise;

import java.util.Scanner;

public class sumColumn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số hàng");
        int row = sc.nextInt();
        System.out.println("Nhập số cột");
        int column = sc.nextInt();
        int [][] arr = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("A[" + i + "]["+ j + "] = ");
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Nhập số cột bạn muốn tính tổng");
        int sumcolumn = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (j == sumcolumn){
                    sum += arr[i][j];
                }
            }
        }
        System.out.println(" ");
        System.out.println(" Tổng các giá trị tại cột " + sumcolumn + "là " + sum);
    }
}
