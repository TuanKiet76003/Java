package ss02_array.exercise;

import java.util.Scanner;

public class showPicture {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Menu ");
        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the square triangle");
        System.out.println("3. Print isosceles triangle");
        System.out.println("4. Exit ");
        while (true){
            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("1. Print the rectangle");
                    for (int i = 1; i <= 5; i++) {
                        System.out.println(" ");
                        for (int j = 1; j <= 10; j++) {
                            System.out.print("*");
                        }
                    }
                    break;
                case 2:
                    System.out.println("2. Print the square triangle");
                    for (int i = 0; i <= 5; i++) {
                        for (int j = 0; j < i; j++) {
                            System.out.print("*");
                        }
                        System.out.println(" ");
                    }
                    System.out.println();
                    break;
                case 3:
                    System.out.println("3.Print isosceles triangle");
                    for (int i = 0; i <= 5; i++) {
                        for (int j = i; j < 5; j++) {
                            System.out.print("*");
                        }
                        System.out.println(" ");
                    }
                    System.out.println();
                    break;
                case 4:
                    System.out.println(" You can Exit thanks you for select ");
                    break;
                default:
                    System.out.println(" Enter your number you can new select ");
            }
        }
    }
}
