package information.teacher;

import java.util.Scanner;

/**
 * Created by sgc on 2/12/16.
 */
public class TeacherServices {
    TeacherInfo teachArray[]=new TeacherInfo[2];
    public void setTeacherInfo(){
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        for (int i=0;i<teachArray.length;i++){
            TeacherInfo teach =new TeacherInfo();
            teachArray[i]=teach;
            System.out.println("Enter the teacher name:");
            teach.name=sc1.nextLine();
            System.out.println("Enter the teacher address:");
            teach.addres=sc1.nextLine();
            System.out.println("Enter the teacher age:");
            teach.age=sc2.nextInt();
            System.out.println("Enter the teacher subject to teach:");
            teach.subjectName=sc1.nextLine();
            System.out.println("Enter the teacher qualifications:");
            teach.qualification=sc1.nextLine();
        }

    }
    public void getTeacherinfo(){
        for (int i=0;i<teachArray.length;i++){
            TeacherInfo th = teachArray[i];
            System.out.println("Teacher name:" +th.name);
            System.out.println("Teacher address:" +th.addres);
            System.out.println("Teacher qualification:" +th.qualification);
        }
    }
}
