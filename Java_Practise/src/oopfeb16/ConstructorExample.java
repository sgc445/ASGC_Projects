package oopfeb16;

/**
 * Created by sgc on 2/16/16.
 */
public class ConstructorExample {
    public static void main(String []args){
        ConstructorExample eg = new ConstructorExample("This is parameter");
        eg.print();
    }
    public void print(){
        System.out.println("This a method.");
    }
   /* public ConstructorExample(){
        System.out.println("Constructor:");
    }*/
    public ConstructorExample(String value){
        System.out.println(value);
    }
}
