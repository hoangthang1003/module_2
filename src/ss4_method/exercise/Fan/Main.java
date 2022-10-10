package ss4_method.exercise.Fan;


import sun.font.TrueTypeFont;

public class Main {
    public static void main(String[] args) {
//Tạo 2 đối tượng Fan
//        Đối tượng Fan 1: Gán giá trị lớn nhất cho speed, radius là 10, color là yellow và quạt ở trạng thái bật.
//        Đối tượng Fan 2: Gán giá trị trung bình cho speed, radius là 5, color là blue và quạt ở trạng thái tắt
        Fan fan = new Fan();
        fan.setSpeed(fan.getFAST());
        fan.setRadius(10);
        fan.setColor("Yellow");
        fan.setOn(true);
        System.out.println(fan.getSpeed() + "\n" + fan.getRadius() + "\n" + fan.getColor() + "\n" + fan.isOn() + "\n");
        Fan fan1 = new Fan();
        fan1.setSpeed(fan.getMEDIUM());
        fan1.setRadius(5);
        fan1.setColor("blue");
        fan1.setOn(false);
        System.out.println(fan1.getSpeed() + "\n" + fan1.getRadius() + "\n" + fan1.getColor() + "\n" + fan1.isOn() + "\n");
    }
}