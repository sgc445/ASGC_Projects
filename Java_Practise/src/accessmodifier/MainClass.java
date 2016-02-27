package accessmodifier;

/**
 * Created by sgc on 2/19/16.
 */
public class MainClass {
    public static void main(String []args){
     Animal an = new Animal();
        an.setSize(3);
        an.volume=35.34;
        //an.colour="red"; this can't be done since colour is private in animal
        Mammals mam = new Mammals();
        mam.setSize(5);
        mam.getSize();/*we can make object of child class to access property of parent class,here Mammals is the child class of the Animal*/
        mam.setColour("red");
    }
}
