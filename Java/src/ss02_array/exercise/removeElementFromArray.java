package ss02_array.exercise;

import java.util.Scanner;

public class removeElementFromArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Nhập số lượng phần tử của mảng ");
        int number = sc.nextInt();
        int []array = new int[number];
        for (int i = 0; i < number; i++) {
            System.out.println("Nhập số lượng phần tử thứ " + i);
            array[i] = sc.nextInt();
        }
        System.out.println(" Mảng bạn vừa nhập là : " + "\t");
        for ( int x : array){
            System.out.print(x);
        }
        System.out.println(" ");
        System.out.println(" Nhập phần tử cần xóa trong mảng ");
        int delete = sc.nextInt();
        int deleteNumber = 0;
        for (int i = 0 ; i < number ; i++) {
            if (array[i] == delete) {
                deleteNumber = i;
                break;
            }
        }
        boolean test = true ;
        for (int i = 0; i < number; i++) {
            if (array[i] == delete){
                test = false;
                break;
            }
        }
        if (test == true){
            System.out.println("Phần tử không có trong mảng");
        }else {
            for (int i = deleteNumber; i < number-1; i++) {
                array[i] = array[i + 1];
            }
            number--;
            System.out.println("Mảng sau khi xóa là");
            for (int i = 0 ; i < number; i++){
                System.out.print(array[i]);
            }
        }
        }
    }
