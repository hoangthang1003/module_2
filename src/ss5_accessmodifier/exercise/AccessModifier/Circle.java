package ss5_accessmodifier.exercise.AccessModifier;

public class Circle {
    private double radius =1.0;
    String color ="Red";
    public Circle() {};
    public Circle(double radius) {
        this.radius = radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getRadius() {
        return this.radius;
    }
    public double getArea() {
        return this.radius*this.radius*3.14;
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
