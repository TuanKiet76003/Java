package ss01_introduction_java.exercise;

import java.util.Scanner;

public class application {
    public static void main(String[] args) {
        int a ;
        int b,c,d,e,f;
        // b đơn vị , c là tham số liên kết ,  d hàng chục , e là hàng trăm  , f là tham số liên kết 2
        Scanner Eng = new Scanner(System.in);
        System.out.print(" Enter your number ");
        a = Eng.nextInt();
        if (a > 0 && a <= 10 ){
            fun1(a);
        }else if (a > 10 && a <= 20 ){
            fun2(a);
        }else if(a>20 && a <= 100){
            b= a/10;
            d= a%10;
            fun3(b);
            fun1(d);
        } else if (a > 100 && a <1000) {
            b = a%10; //  512 % 10 = 2
            c = a/10; // 512 / 10 = 51
            f = c%10; // 51 % 10 = 1
            if (f==0 ) {
                e = c / 10; //
                fun4(e);
                fun1(b);
            }else if (f==1) {
                e = c / 10; // 51 / 10 = 5
                d = a % 100; // 512 % 100 = 12
                fun4(e);
                fun2(d);
            }else {
                d = c % 10; // 13 % 10 = 3;
                e = c / 10; // 13 /10 = 1;
                fun4(e);
                fun3(d);
                fun1(b);
            }
        }
    }

    public static void fun1(int x ){
        switch (x) {
            case 1:
                System.out.print(" one ");
                break;
            case 2:
                System.out.print("two");
                break;
            case 3:
                System.out.print("three");
                break;
            case 4:
                System.out.print(" four ");
                break;
            case 5:
                System.out.print("five");
                break;
            case 6:
                System.out.print("six");
                break;
            case 7:
                System.out.print(" seven ");
                break;
            case 8:
                System.out.print("eight");
                break;
            case 9:
                System.out.print("nine");
                break;
            case 10:
                System.out.print("ten");
                break;
            default:
                System.out.print("out of ability");
        }
    }
    public static void fun2(int x ){
        switch (x) {
            case 10:
                System.out.print("ten");
                break;
            case 11:
                System.out.print(" eleven ");
                break;
            case 12:
                System.out.print("twele");
                break;
            case 13:
                System.out.print("thirteem");
                break;
            case 14:
                System.out.print(" fourteen ");
                break;
            case 15:
                System.out.print("fiveteen");
                break;
            case 16:
                System.out.print("sixteen ");
                break;
            case 17:
                System.out.print(" seventeen ");
                break;
            case 18:
                System.out.print("eighteen");
                break;
            case 19:
                System.out.print("nineteen ");
                break;
            case 20:
                System.out.print("twenty");
                break;
            default:
                System.out.print("out of ability");
        }
    }
    public static void fun3(int x ){
        switch (x) {
            case 2:
                System.out.print(" twenty ");
                break;
            case 3:
                System.out.print("thirty");
                break;
            case 4:
                System.out.print("fourty");
                break;
            case 5:
                System.out.print(" fifty ");
                break;
            case 6:
                System.out.print("sixty");
                break;
            case 7:
                System.out.print("seventy");
                break;
            case 8:
                System.out.print("eighty ");
                break;
            case 9:
                System.out.print("ninety");
                break;
            case 10:
                System.out.print(" hundred");
                break;
            default:
                System.out.print("out of ability");
        }
    }
    public static void fun4(int x ) {
        switch (x) {
            case 1:
                System.out.print(" one hundred");
                break;
            case 2:
                System.out.print(" two hundred ");
                break;
            case 3:
                System.out.print("thirt hundred");
                break;
            case 4:
                System.out.print("four hundred");
                break;
            case 5:
                System.out.print(" five hundred ");
                break;
            case 6:
                System.out.print("six hundred");
                break;
            case 7:
                System.out.print("seven hundred");
                break;
            case 8:
                System.out.print("eight hundred ");
                break;
            case 9:
                System.out.print("nine hundred");
                break;
            default:
                System.out.print("out of ability");
        }
    }
}
