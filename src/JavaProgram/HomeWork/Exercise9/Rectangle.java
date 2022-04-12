package JavaProgram.HomeWork.Exercise9;

public class Rectangle extends Shape {
    double width;
    double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                ", area=" + calcArea() +
                '}';
    }

    @Override
    public double calcArea() {
        return width * height;
    }
}
