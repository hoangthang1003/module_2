package ss7_AbstractClass.exercise.Resizeable;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3.5);
        System.out.println(circle);

        circle = new Circle(3.5, "indigo", false);
        double percent = Math.floor(Math.random() * 100) + 1;
        System.out.println(circle.getArea()+"\n"+circle.resize(percent));
    }
}