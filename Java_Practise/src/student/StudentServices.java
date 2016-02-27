package student;

import java.util.Scanner;

/**
 * Created by sgc on 2/11/16.
 */
public class StudentServices {
    StudentProperties std = new StudentProperties();
    public void setInfo(int num){
        Scanner sc = new Scanner(System.in);
        Scanner sci = new Scanner(System.in);
        for (int i=0;i<num;i++) {
            System.out.println("Enter the student name:");
            std.name = sc.nextLine();
            System.out.println("Enter the student address:");
            std.addres = sc.nextLine();
            System.out.println("Enter the student gender:");
            std.gender = sc.nextLine();
            System.out.println("Enter the student age");
            std.age = sci.nextInt();
        }
    }
    public void getInfo(int num) {
        for (int i = 0; i < num; i++) {
            System.out.println("Student name:" + std.name);
            System.out.println("Student address:" + std.addres);
            System.out.println("Student gender:" + std.gender);
            System.out.println("Student age:" + std.age);
        }
    }
}
