package Shape;

import Base.ShapeBase;

/**
 * A class that has the characteristics of the Rectangle shape
 */
public class Rectangle extends ShapeBase {

    //parameters
    public Rectangle(String name, int width, int height) {
        super(name, width, height); //parent class (ShapeBase) objects
    }

    //getter - area of a Rectangle
    public int calculateArea(){
        return width * height;
    }
}
