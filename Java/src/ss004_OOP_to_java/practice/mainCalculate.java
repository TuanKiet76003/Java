package ss004_OOP_to_java.practice;

import java.awt.*;
import java.util.Scanner;

public class mainCalculate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter your width");
        double width = sc.nextDouble();
        System.out.println(" Enter your height");
        double height = sc.nextDouble();
        retangleClass rectangle = new retangleClass(width,height);
        System.out.println("Hình chữ nhật của bạn là : \n" + rectangle.display() );
        System.out.println("Diện tích hình chữ nhật là : \n" + rectangle.getArea() );
        System.out.println("Chu vi hình chữ nhật  : \n" + rectangle.getPerimeter() );
    }
}
