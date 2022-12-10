package MainProgram;

import Base.ShapeBase;
import Shape.Rectangle;
import Shape.Triangle;

public class Test {

    private static void displayArea(ShapeBase base) {
        System.out.println("\nDisplay the area for shape named: " + base.getName() + ".\n\nWidth: " + base.getWidth() +
                " \nHeight: " + base.getHeight() + "\nArea: " + base.calculateArea() + "\n");
    }

    public static void main(String[] args) {
        ShapeBase[] shapes = new ShapeBase[2];
        shapes[0] = new Rectangle("Rectangle", 10, 20);
        shapes[1] = new Triangle("Triangle", 10, 20);

        for (int i = 0; i < shapes.length; i++) {
            displayArea(shapes[i]);
        }
    }
}
