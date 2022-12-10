package Shape;

import Base.ShapeBase;

/**
 * A class that has the characteristics of the Triangle shape
 */
public class Triangle extends ShapeBase {

    //parameters
    public Triangle(String name, int width, int height) {
        super(name, width, height); //parent class (ShapeBase) objects
        //TODO auto-generated constructor
    }

    //getter - area of a Triangle
    public int calculateArea(){
        return width * height / 2;
    }
}
