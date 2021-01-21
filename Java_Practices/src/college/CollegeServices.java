package college;

import java.util.Scanner;

/**
 * Created by sgc on 2/11/16.
 */
public class CollegeServices {
    CollegeAttribute co = new CollegeAttribute();
    public void setCollegeInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the college name:");
        co.collegeName=sc.nextLine();
        System.out.println("Enter the college location:");
        co.location=sc.nextLine();
        System.out.println("Enter college phone number:");
        co.phoneNumber=sc.nextLine();

    }
    public void getCollegeInfo(){
        System.out.println("College name:" +co.collegeName);
        System.out.println("college location:" +co.location);
        System.out.println("College phone number:" +co.phoneNumber);
    }

}
