package ss4_method.exercise.Fan;


public class Fan {
    final int Slow = 1, Medium = 2, Fast = 3;
    int speed = Slow;
    boolean on;
    double radius = 5;
    String color = "Blue";

    public int getSLOW() {
        return Slow;
    }

    public int getMEDIUM() {
        return Medium;
    }

    public int getFAST() {
        return Fast;
    }

    public Fan() {
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return this.speed;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }
    public void setOn(boolean on) {
        this.on = on;
    }

    public boolean isOn() {
        return this.on;
    }

    public String toString() {
        if (this.on) {
            return "Fan is on: \n- speed: " + this.speed
                    + "\n- color: " + this.color
                    + "\n- radius: " + this.radius;
        } else {
            return "Fan is off: \n- color: " + this.color
                    + "\n- radius: " + this.radius;
        }
    }
}
