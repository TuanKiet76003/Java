package ss06_inheritance.exercise.point;

public class Point3D extends Point2D{
    private float z = 0.0f;
    public Point3D(float x , float y , float z){
        super(x, y);
        this.z = z;
    }
    public Point3D(){}

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x ,float y , float z){
        setXY(x, y);
        this.z = z ;
    }
    public float [] getXYZ(){
        float [] arr = {getX(),getY(),z};
        return arr;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                " x = " + getX() +
                " y = " + getY() +
                " z =" + z +
                '}';
    }

    public static void main(String[] args) {
        Point3D point3D = new Point3D(1.2f,3.5f,7.2f);
        System.out.println(point3D);
    }
}
