package information.student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by sgc on 2/12/16.
 */
public class StudentServices {
    //StudentInfo stArray[] = new StudentInfo[2];
    List <StudentInfo> stdList = new ArrayList<>();

    public void setStudenInfo() {
        Scanner sc = new Scanner(System.in);
        Scanner sci = new Scanner(System.in);
       /* for (int i = 0; i < stArray.length; i++) {
            StudentInfo std = new StudentInfo();
            stArray[i] = std;
            System.out.println("Enter the student name:");
            std.name = sc.nextLine();
            System.out.println("Enter the student address:");
            std.addres = sc.nextLine();
            System.out.println("Enter the student gender:");
            std.gender = sc.nextLine();
            System.out.println("Enter the student age");
            std.age = sci.nextInt();
        }*/
    }
    public void getStdInfo() {
        /*for (int i = 0; i < stArray.length; i++) {
            StudentInfo st = stArray[i];
            System.out.println("Student name:" + st.name);
            System.out.println("Student address:" + st.addres);
            System.out.println("Student gender:" + st.gender);
            System.out.println("Student age:" + st.age);
        }*/
    }
}
