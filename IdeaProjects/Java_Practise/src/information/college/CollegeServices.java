package information.college;

import java.util.List;
import java.util.Scanner;

/**
 * Created by sgc on 2/12/16.
 */
public class CollegeServices {
    CollegeInfo collArray[]=new CollegeInfo[2];
    public void setCollegeInfo(){
        Scanner sc = new Scanner(System.in);
        for (int i=0;i<collArray.length;i++){
            CollegeInfo cl = new CollegeInfo();
            collArray[i]=cl;
            System.out.println("Enter the college name:");
            cl.collName=sc.nextLine();
            System.out.println("Enter college location:");
            cl.collLocation=sc.nextLine();
        }
    }
    public void getCollInfo(){
        for (int i=0;i<collArray.length;i++) {
            System.out.println("College Name:" +collArray[i].collName);
            System.out.println("College address:" +collArray[i].collLocation);
        }
    }
}
