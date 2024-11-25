package hw2_5;

public class Circle {

    private final int radius;

    public Circle(int radius) {
        this.radius = radius;
    }


    public double getArea() {
        return Math.PI * (radius * radius);
    }

    public  double getCircumference() {
        return 2 * Math.PI * radius;
    }
}
