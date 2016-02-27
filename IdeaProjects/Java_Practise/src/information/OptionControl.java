package information;

import information.college.CollegeServices;
import information.student.StudentServices;
import information.teacher.TeacherServices;

import java.util.Scanner;

/**
 * Created by sgc on 2/12/16.
 */
public class OptionControl {
    Scanner sc = new Scanner(System.in);
    public void switchCaseControl(){
        int num = getChoice();
        switch (num){
            case 1 :
                StudentServices stdService = new StudentServices();
                stdService.setStudenInfo();
                stdService.getStdInfo();
                break;
            case 2 :
                TeacherServices tchService = new TeacherServices();
                tchService.setTeacherInfo();
                tchService.getTeacherinfo();
                break;
            case 3:
                CollegeServices collService = new CollegeServices();
                collService.setCollegeInfo();
                collService.getCollInfo();
                break;
            case 4:
                System.exit(0);
            default:
                break;

        }
    }
    public void ifElseControl(){
        int num = getChoice();
        if (num==1){
            StudentServices stdServ = new StudentServices();
            stdServ.setStudenInfo();
            stdServ.getStdInfo();
        }
        else if (num==2){
            TeacherServices tchServ = new TeacherServices();
            tchServ.setTeacherInfo();
            tchServ.getTeacherinfo();
        }
        else if (num==3){
            CollegeServices collServ = new CollegeServices();
            collServ.setCollegeInfo();
            collServ.getCollInfo();
        }
        else if (num==4){
            System.exit(0);
        }


    }

    private int getChoice() {
        System.out.println("Enter the option give below 1,2 and 3:");
        System.out.println("1.Student");
        System.out.println("2.teacher");
        System.out.println("3.College");
        System.out.println("4.Exit");
        return sc.nextInt();
    }
}
