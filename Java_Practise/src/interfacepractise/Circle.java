package interfacepractise;

/**
 * Created by sgc on 2/24/16.
 */
public class Circle implements Polygon {
    private float radius;
    private void setRadius(float radius){
        this.radius=radius;
    }
    public void area(){
        System.out.println("circle Area:" +(Math.PI*Math.sqrt(radius)));
    }
    public void perimeter(){
        System.out.println("circle perimeter:" +2*Math.PI*radius);
    }
    public void setProperties(){
        setRadius(3);
    }
}
