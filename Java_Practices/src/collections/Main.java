package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by sgc on 2/26/16.
 */
public class Main {
    public static void main(String[] args) {
        listTest();
    }

    public static void listTest() {
        List<String> mylist = new ArrayList<>();
        mylist.add("ram");
        mylist.add("hari");
        mylist.add("shyam");
        mylist.add(0, "rejin");
        System.out.println(mylist.get(0));
        if (mylist.contains("shyam")) {
            System.out.println(mylist.indexOf("ram"));
        }
        mylist.remove(3);
        System.out.println(mylist.get(2));

       for( Iterator<String> nameList = mylist.iterator();
        nameList.hasNext();)
        System.out.println("*****" +nameList.next());

    }
}
