package Base;

public class ShapeBase extends ShapeInterface {

    protected String name;
    protected int width, height;

    public ShapeBase(String name, int width, int height){
        super();
        this.name = name;
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int calculateArea(){
        //TODO auto-generated method
        return 0;
    }
}
