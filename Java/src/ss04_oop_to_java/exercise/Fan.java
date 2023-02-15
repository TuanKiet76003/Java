package ss04_oop_to_java.exercise;

public class Fan {
    public static final int slow = 1;
    public static final int medium = 2;
    public static final int fast = 3;
    private int speed = 1;
    private boolean on = false;
    private double radius = 5;
    private String color = new String("blue");

    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String toString() {
        if (on == true) {
            return "Toc do: " + speed + ", Mau sac: " + color + ", Ban kinh: " + radius + ", fan is on";
        } else {
            return "Toc do: " + speed + ", Mau sac: " + color + ", Ban kinh: " + radius + ", fan is off";
        }
    }
    public static void main(String[] args) {
        Fan fan1 = new Fan(3,true,9.0, "yellow" );
        Fan fan2 = new Fan(1,false,0.0,"black");
        System.out.println("Quạt số 1 " + fan1 );
        System.out.println("Quạt số 2 " + fan2 );
    }
}
