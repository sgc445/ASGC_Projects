package studentfeb11;

import java.util.Scanner;

/**
 * Created by sgc on 2/12/16.
 */
public class Main {
    public static void main(String []args){
        StudentService serv = new StudentService();
        serv.setInfo();
        serv.getInfo();
    }
}
