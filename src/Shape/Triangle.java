package Shape;

import Base.ShapeBase;

public class Triangle extends ShapeBase {

    public Triangle(String name, int width, int height) {
        super(name, width, height);
        //TODO auto-generated constructor
    }

    public int calculateArea(){
        return width * height / 2;
    }
}
