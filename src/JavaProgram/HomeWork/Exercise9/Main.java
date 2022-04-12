package JavaProgram.HomeWork.Exercise9;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Rectangle(2.5, 5.5),
                new Rectangle(4.67, 8.75),
                new Rectangle(3.56, 9.578),
                new Rectangle(2.43, 5.565),
                new Circle(2.5),
                new Circle(6.5),
                new Circle(8.5),
                new Triangle(3.0, 4.0, 5.0),
                new Triangle(5.1, 5.1, 5.1)
        };
        displayShapes(shapes);
        double totalValue = calculateTotalArea(shapes);
        System.out.println(totalValue);
        double totalRectangleArea = calculateRectangleArea(shapes);
        System.out.println(totalRectangleArea);
        double totalCircleArea = calculateCircleArea(shapes);
        System.out.println(totalCircleArea);
        double totalTriangleArea = calculateTriangleArea(shapes);
        System.out.println(totalTriangleArea);
    }

    public static void displayShapes(Shape[] shapes) {
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }

    public static double calculateTotalArea (Shape[] shapes) {
        double total = 0.0;
        for (Shape shape : shapes) {
            total += shape.calcArea();
        }

        return total;
    }

    public static double calculateRectangleArea (Shape[] shapes) {
        double total = 0.0;
        for (Shape shape : shapes) {
            if (shape instanceof Rectangle) {
                total += shape.calcArea();
            }
        }
        return total;
    }

    public static double calculateCircleArea (Shape[] shapes) {
        double total = 0.0;
        for (Shape shape : shapes) {
            if (shape instanceof Circle) {
                total += shape.calcArea();
            }
        }
        return total;
    }
    public static double calculateTriangleArea (Shape[] shapes) {
        double total = 0.0;
        for (Shape shape : shapes) {
            if (shape instanceof Triangle) {
                total += shape.calcArea();
            }
        }
        return total;
    }
}

