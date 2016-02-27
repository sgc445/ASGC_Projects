package feb23inheritance;

/**
 * Created by sgc on 2/23/16.
 */
public abstract class Polygon {

    protected float length;
    protected float breadth;
    protected float height;
    public abstract void area();
    public abstract void perimeter();
    public abstract void setProperty();
    public void setLength(float length){
        this.length=length;
    }
    public void setBreadth(float breadth){
        this.breadth=breadth;
    }
    public void setHeight(float height){
        this.height=height;
    }
}