package ss05_Access_modifier.practice.staticMethod;

import ss05_Access_modifier.practice.staticMethod.StaticMethod;

public class TestStaticMethod {
    public static void main(String[] args) {
        StaticMethod.change();
        StaticMethod s1 = new StaticMethod(111,"Hoàng ");
        StaticMethod s2 = new StaticMethod(222,"Khánh ");
        StaticMethod s3 = new StaticMethod(333,"Nam ");
        s1.display();
        s2.display();
        s3.display();
    }
}
