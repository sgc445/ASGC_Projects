package accessmodifier;

/**
 * Created by sgc on 2/19/16.
 */
public class Animal {
    private String colour;
    public int size;
    protected double volume;
    private void makeSound(){
        System.out.println("they make sound");
    }
    public void setSize(int s){
     size=s;
        System.out.println("size was set as size=:" +size);
    }
    public void setColour(String col){
        colour=col;
        System.out.println("colour is set as:" +colour);
    }

}
