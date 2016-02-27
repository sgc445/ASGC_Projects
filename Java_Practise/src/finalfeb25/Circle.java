package finalfeb25;

/**
 *f
 */
public class Circle extends Polygon {
    private float radius;
    public void setRadius(float radius){
        this.radius=radius;
    }
    public void area(){
        System.out.println("area is:" +pi*radius*radius);
    }
}
