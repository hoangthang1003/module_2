package ss6_inheritance.exercise;

public class Cylinder extends Circle {
    private double hight = 1.0;
    public Cylinder() {}
    public Cylinder(double radius,String color, double hight) {
        super(radius,color);
        this.hight = hight;
    }

    public double getHight() {
        return hight;
    }

    public void setHight(double hight) {
        this.hight = hight;
    }
    public double getVolume() {
        return getArea()*getHight();
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "hight=" + hight +"Thể tích là: "+
                getVolume()+
                '}';
    }
}
