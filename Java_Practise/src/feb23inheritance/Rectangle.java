package feb23inheritance;

/**
 * Created by sgc on 2/23/16.
 */
public class Rectangle extends Polygon {
  public void area(){
      System.out.println("Area is:" +(length*breadth));
  }
    public void perimeter(){
        System.out.println("Perimeter is:" +2*(length+breadth));
    }
    public void setProperty(){
        setLength(3);
        setBreadth(2);
    }
}
