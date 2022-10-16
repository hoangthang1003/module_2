package ss7_AbstractClass.exercise.Resizeable;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(2.3, 5.8);
        System.out.println(rectangle);

        rectangle = new Rectangle(2.5, 3.8, "orange", true);
        double percent = Math.floor(Math.random() * 100) + 1;
        System.out.println(rectangle.getArea()+"\n"+rectangle.resize(percent));
    }
}
