package information;

import java.util.Scanner;

/**
 * Created by sgc on 2/12/16.
 */
public class Main {
    public static void main(String []args){
        selectChoice();

    }

    private static void selectChoice() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the one options among two 1 for switch Case and 2 for if else:");
        System.out.println("1.Switch Case:");
        System.out.println("2.If/else:");
        int num = sc.nextInt();
        OptionControl opt = new OptionControl();

        if (num==1)
            opt.switchCaseControl();
        else if (num==2)
            opt.ifElseControl();
    }
}
