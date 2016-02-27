package college;

import java.util.Scanner;

/**
 * Created by sgc on 2/11/16.
 */
public class CollegeMain {
    public static void main(String []args){
        CollegeServices collServ = new CollegeServices();
        collServ.setCollegeInfo();
        collServ.getCollegeInfo();
    }
}
