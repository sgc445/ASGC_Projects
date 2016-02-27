package shopping;

import java.util.Scanner;

/**
 * Created by sgc on 2/18/16.
 */
public class Choice {
    public  void choice() {
        System.out.println("Do u want shopping? y or n");
        Scanner sc = new Scanner(System.in);
        String choice = sc.nextLine();
        Process p = new Process();
        switch (choice) {
            case "y":
                String ch = null;
                do {

                    p.displayItem();
                    p.selectItem();
                    System.out.println("do u want to shop again?");
                    ch = sc.nextLine();
                } while (ch.equals("y"));
                System.out.println("Your bills is:");
                p.billDisplay();
                System.out.println("Do u want to remove any goods? if so enter 'y'");

                break;
            default:
                break;

        }
    }
}
