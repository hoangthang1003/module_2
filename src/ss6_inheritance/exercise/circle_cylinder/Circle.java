package ss6_inheritance.exercise;

public class Circle {
    private double radius = 1;
    private String color = "Red";

    public Circle(){}
    public Circle(double radius,String color) {
        this.radius = radius;
        this.color = color;
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    public double getArea() {
        return getRadius()*getRadius()* Math.PI;
    }

    @Override
    public String toString() {
        return "Diện tích là: "+getArea();
    }
}
