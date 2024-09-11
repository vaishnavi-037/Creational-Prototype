package prototype;

import shapes.Circle;
import shapes.Rectangle;
import shapes.Shape;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Shape> shapeList = new ArrayList<>();

        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(10, 10);

        shapeList.add(circle);
        shapeList.add(rectangle);

        for (Shape shape : shapeList){
            Shape clone = shape.clone();
            System.out.println("Original " + shape);
            System.out.println("Prototype " + clone);

            if (shape != clone) System.out.println("Shapes are different objects (yay!)");
            if (shape.equals(clone)) System.out.println("And they are identical (yay!)");
        }
    }
}
