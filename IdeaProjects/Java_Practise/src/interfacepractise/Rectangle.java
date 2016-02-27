package interfacepractise;

/**
 * Created by sgc on 2/23/16.
 */
public class Rectangle implements Polygon {
    private float length;
    private float breadth;

   private void setLength(float length){
       this.length=length;
   }
    private void setBreadth(float breadth){
        this.breadth=breadth;
    }
    public void setProperties(){
        setBreadth(3);
        setLength(8);
    }
    public void perimeter(){
        System.out.println("perimeter:" +2*(length+breadth));
    }
     public void area(){
         System.out.println("area:" +(length*breadth));
    }

}
