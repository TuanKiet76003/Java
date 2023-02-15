package ss02_array.exercise;

import java.util.Scanner;

public class mergeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []arrayOne = new int[3];
        System.out.println(" Nhập số phần tử của mảng 1 ");
        int numberOne = sc.nextInt();
        for (int i = 0; i < numberOne ; i++) {
            System.out.println("Nhập phần tử thứ " + i +  "trong mảng");
            arrayOne[i] = sc.nextInt();
        }
        System.out.println(" Mảng 1 bạn vừa nhập là :  ");
        for (int i = 0; i < numberOne; i++) {
            System.out.print(arrayOne[i]);
        }
        System.out.println(" " );
        int []arrayTwo = new int[3];
        System.out.println("Nhập số phần tử của mảng 2");
        int numberTwo = sc.nextInt();
        for (int i = 0; i < numberTwo; i++) {
            System.out.println("Nhập phần tử thứ " + i + "trong mảng");
            arrayTwo[i] = sc.nextInt();
        }
        System.out.println("Mảng 2 bạn vừa nhập là ");
        for (int i = 0; i < numberTwo; i++) {
            System.out.print(arrayTwo[i]);
        }
        System.out.println(" ");
        int []arrayThree = new int[arrayOne.length + arrayTwo.length];
        System.arraycopy(arrayOne, 0, arrayThree, 0, arrayOne.length);
        System.arraycopy(arrayTwo, 0, arrayThree, arrayOne.length, arrayTwo.length);
        System.out.println("Sau khi gộp 2 mảng là :");
        for(int value : arrayThree)
            System.out.print(value + "\t");
    }
}
