package MainProgram;

import Base.ShapeBase;
import Shape.Rectangle;
import Shape.Triangle;

/**
 * Tester class for the Rectangle, Triangle classes working inside of the ShapeBase
 * parent class.
 * The ShapeBase parent class defines the object values being called into the shape classes.
 *
 * @author 20108508
 */
public class Test {

    private static void displayArea(ShapeBase base) {
        System.out.println("\nDisplay the area for shape named: " + base.getName() + ".\n\nWidth: " + base.getWidth() +
                " \nHeight: " + base.getHeight() + "\nArea: " + base.calculateArea() + "\n");
    }

    public static void main(String[] args) {
        ShapeBase[] shapes = new ShapeBase[2];
        shapes[0] = new Rectangle("Rectangle", 10, 20);
        shapes[1] = new Triangle("Triangle", 10, 20);

        for (int i = 0; i < shapes.length; i++) { //print each shape defined in the array
            displayArea(shapes[i]);
        }
    }
}
