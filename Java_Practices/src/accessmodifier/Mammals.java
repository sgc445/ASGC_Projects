package accessmodifier;

/**
 * Created by sgc on 2/19/16.
 */
public class Mammals extends Animal {
    private String typeOfFood;
    protected void getSize(){
        System.out.println("size is:" +size);
    }
    public void getColour(){
        setColour("blue");
    }
}
