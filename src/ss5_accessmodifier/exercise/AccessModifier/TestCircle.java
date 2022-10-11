package ss5_accessmodifier.exercise.AccessModifier;

public class TestCircle {
    public static void main(String[] args) {

        Circle circle = new Circle();
        System.out.println(circle.getRadius()+"\n" + circle.getArea());
        circle.setRadius(2.0);
        System.out.println(circle.getRadius()+"\n"+circle.getArea()+"\n"+circle.color);
    }
}
