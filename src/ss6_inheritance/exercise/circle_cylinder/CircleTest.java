package ss6_inheritance.exercise.circle_cylinder;

class CircleCylinderTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle.toString());
        Cylinder cylinder = new Cylinder();
        cylinder.setHight(2);
        System.out.println(cylinder.toString());
    }
}