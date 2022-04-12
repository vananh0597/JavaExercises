package JavaProgram.HomeWork.Exercise9;

public class Triangle extends Shape {
    double a;
    double b;
    double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", area=" + calcArea() +
                '}';
    }

    @Override
    public double calcArea() {
        return Math.sqrt((a + b + c) * (a + b - c) * (b + c - a) * (c + a - b)) / 4;
    }
}
