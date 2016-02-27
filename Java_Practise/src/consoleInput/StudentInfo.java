package consoleInput;

import java.util.Scanner;

/**
 * Created by sgc on 2/11/16.
 */
public class StudentInfo {
    public static void main(String []args){
        StudentInfo std = new StudentInfo();
        std.printInfo();

    }
    public void printInfo(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the student name:");
        String name = s.nextLine();
        System.out.println("Enter the address:");
        String address = s.nextLine();
        System.out.println("Enter the percentage:");
        float percent = s.nextFloat();
        System.out.println("Name:" +name);
        System.out.println("address:" +address);
        System.out.println("percentage:" +percent);
    }

}
