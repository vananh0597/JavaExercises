package JavaProgram.HomeWork.Exercise9;

public class Circle extends Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", circleArea=" + calcArea() +
                '}';
    }

    @Override
    public double calcArea(){
        return Math.pow(radius, 2) * Math.PI;
    }

}
