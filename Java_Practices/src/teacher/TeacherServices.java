package teacher;

import java.util.Scanner;

/**
 * Created by sgc on 2/11/16.
 */
public class TeacherServices {
    TeacherAttribute teach = new TeacherAttribute();
    public void setTeacherInfo(){
        Scanner sc = new Scanner(System.in);
        Scanner sci = new Scanner(System.in);
        System.out.println("Enter the teacher name:");
        teach.name=sc.nextLine();
        System.out.println("Enter the teacher address:");
        teach.addres=sc.nextLine();
        System.out.println("Enter the teacher age:");
        teach.age=sci.nextInt();
        System.out.println("Enter the teacher subject to teach:");
        teach.subjectName=sc.nextLine();
        System.out.println("Enter the teacher qualifications:");
        teach.qualification=sc.nextLine();
    }
    public void getTeacherInfo(){
        System.out.println("Teacher name:" +teach.name);
        System.out.println("Teacher address:" +teach.addres);
        System.out.println("Teacher age:" +teach.age);
        System.out.println("Teacher subject:" +teach.subjectName);
        System.out.println("Teacher qualification:" +teach.qualification);
    }
}
