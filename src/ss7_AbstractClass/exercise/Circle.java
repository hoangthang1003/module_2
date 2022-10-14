package ss7_AbstractClass.exercise;

    public class Circle extends Shape implements Resizeable{
        private double radius = 1.0;
        private double size = 1;

        public Circle() {
        }

        public Circle(double radius) {
            this.radius = radius;
        }

        public Circle(double radius, String color, boolean filled) {
            super(color, filled);
            this.radius = radius;
        }

        public double getRadius() {
            return radius;
        }

        public void setRadius(double radius) {
            this.radius = radius;
        }

        public double getArea() {
            return radius * radius * Math.PI;
        }

        public double getPerimeter() {
            return 2 * radius * Math.PI;
        }

        @Override
        public String toString() {
            return "A Circle with radius="
                    + getRadius()
                    + ", which is a subclass of "
                    + super.toString();
        }

        @Override
        public double resize(double percent) {
            return percent*getArea()/100+getArea();
        }
//        public void resize(double percent) {
//            size += size * percent / 100;
//        }
    }
