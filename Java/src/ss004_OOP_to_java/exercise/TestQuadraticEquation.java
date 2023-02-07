package ss004_OOP_to_java.exercise;

import java.util.Scanner;

public class TestQuadraticEquation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số a");
        double a = sc.nextDouble();
        System.out.println("Nhập số b");
        double b = sc.nextDouble();
        System.out.println("Nhập số c");
        double c = sc.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        if (quadraticEquation.getDiscriminant() < 0){
            System.out.println("Phương trình vô nghiệm ");
        }else if (quadraticEquation.getDiscriminant() == 0){
            System.out.println(" Phương trình có một nghiệm duy nhất " + quadraticEquation.getDoubleSolution() );
        }else {
            System.out.println("Phương trình có hai nghiệm là :{" + "x1 = " + quadraticEquation.getRoot1());
            System.out.println( "x2 = " + quadraticEquation.getRoot2() + " }");
        }
    }
}
