package student;

import java.util.Scanner;

/**
 * Created by sgc on 2/11/16.
 */
public class StudentMain {
    public static void main(String []args){
        StudentServices serv = new StudentServices();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of student to keep record:");
        int num = sc.nextInt();
        serv.setInfo(num);
        serv.getInfo(num);
    }
}
