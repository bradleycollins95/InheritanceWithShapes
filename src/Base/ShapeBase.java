package Base;

/**
 * A parent class that helps define shapes, and their parameters
 * when determining calculations for things like area, perimeter, etc.
 *
 * @author 20108508
 */
public class ShapeBase extends ShapeInterface {

    protected String name; //only accessible in this package
    protected int width, height; //only accessible in this package

    public ShapeBase(String name, int width, int height){
        super(); //parent class objects
        this.name = name;
        this.height = height;
        this.width = width;
    }

    //getter
    public int getHeight() {
        return height;
    }

    //setter
    public void setHeight(int height) {
        this.height = height;
    }

    //getter
    public int getWidth() {
        return width;
    }

    //setter
    public void setWidth(int width) {
        this.width = width;
    }

    //getter
    public String getName() {
        return name;
    }


    //setter
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int calculateArea(){
        //TODO auto-generated method
        return 0;
    }
}
