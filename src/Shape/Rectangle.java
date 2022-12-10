package Shape;

import Base.ShapeBase;

public class Rectangle extends ShapeBase {

    public Rectangle(String name, int width, int height) {
        super(name, width, height);
    }

    public int calculateArea(){
        return width * height;
    }
}
