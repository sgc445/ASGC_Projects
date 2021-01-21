package staticfeb25;

/**
 * Created by sgc on 2/25/16.
 */
public class Student {
    private static String name ="ram";

    public static   void setName(String n){
        name=n;
    }
    public static String getName(){
        return name;
    }
}
