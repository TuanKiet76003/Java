package ss05_access_modifier.practice.staticMethod;

public class StaticMethod {
   private int rollno;
   private String name;
    private static String college = "BBDIT";
    // khởi tạo constructor

    public StaticMethod(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }
    static void change(){
        college =  "Codegym";
    }
    void display(){
        System.out.println( rollno +" " + name + college);
    }

}

