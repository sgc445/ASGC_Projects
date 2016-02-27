package oopconcept;

/**
 * Created by sgc on 2/18/16.
 */
public class Mains {
    public static void main(String []args){
        PolymorphismTest p1 = new PolymorphismTest(1,2);
        PolymorphismTest p2 = new PolymorphismTest("ram","abc2",5.0);
        p1.display(3);
        p2.display();
        PolymorphismTest p3 = new PolymorphismTest(3,4,5.0);
        System.out.println(p3.display(3.0));
    }
}
