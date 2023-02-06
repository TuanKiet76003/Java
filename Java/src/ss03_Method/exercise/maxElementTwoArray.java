package ss03_Method.exercise;

import java.util.Scanner;

public class maxElementTwoArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số hàng ngang");
        int row = sc.nextInt();
        System.out.println("Nhập vào số hàng dọc");
        int column = sc.nextInt();
        double[][] array = new double[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("A[" + i + "]["+ j + "] = ");
                array[i][j] = sc.nextDouble();
            }
        }
        double max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (max < array[i][j]){
                    max = array[i][j];
                }
            }
        }
        System.out.println("Giá trị lớn nhất trong mảng 2 chiều là : " + max);
    }
}
