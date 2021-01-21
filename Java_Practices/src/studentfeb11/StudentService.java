package studentfeb11;

import java.util.Scanner;

/**
 * Created by sgc on 2/12/16.
 */
public class StudentService {
    StudentAttribute stdArray[]=new StudentAttribute[2];
    public void setInfo(){
        Scanner sc = new Scanner(System.in);
        Scanner sci = new Scanner(System.in);
        for (int i=0;i<stdArray.length;i++){
            StudentAttribute std = new StudentAttribute();
            stdArray[i]=std;
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
    public void getInfo(){
        for (int i=0;i<stdArray.length;i++){
            //std= stdArray[i];
            System.out.println("Student name:" + stdArray[i].name);
            System.out.println("Student address:" + stdArray[i].addres);
            System.out.println("Student gender:" + stdArray[i].gender);
            System.out.println("Student age:" + stdArray[i].age);

        }
    }

}
