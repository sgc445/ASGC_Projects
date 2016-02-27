package shopping;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by sgc on 2/17/16.
 */
public class Process {
    int noodleTotal = 0;
    int biscuitTotal=0;
    double noodleTotalPrice=0.0;
    double biscuitTotalPrice=0.0;
    Set<String>item = new HashSet<>();
    public void displayItem(){
        System.out.println("Show the foodList available");
        Process p =new Process();
        System.out.println("codeNo  name  quantity  price");
        p.format(ItemStore.noodle.itemCode, ItemStore.noodle.name,ItemStore.noodle.quantity,ItemStore.noodle.price);
        p.format(ItemStore.biscuit.itemCode, ItemStore.biscuit.name,ItemStore.biscuit.quantity,ItemStore.biscuit.price);

    }
    public void format(String codeNo,String name,int quantity,double price){
        System.out.println(codeNo+ "  "+name + "  " + quantity +"  " +price);
    }
    public void selectItem(){

        System.out.println("Which item you want to buy,enter code no ");
        Scanner sc = new Scanner(System.in);
        String choice = sc.nextLine();
        item.add(choice);
        System.out.println("Enter the quantity");
        Scanner sc1 = new Scanner(System.in);
        int quan = sc1.nextInt();
        switch (choice){
            case "abc1":
                if (quan<=ItemStore.noodle.quantity) {
                    ItemStore.noodle.quantity -= quan;
                    noodleTotalPrice += quan * ItemStore.noodle.price;
                    noodleTotal += quan;
                }
                else
                    System.out.println("out of stock:");
                break;
            case "abc2":
                if (quan<=ItemStore.biscuit.quantity) {
                    ItemStore.biscuit.quantity -= quan;
                    biscuitTotalPrice += quan * ItemStore.biscuit.price;
                    biscuitTotal += quan;
                }
                else
                    System.out.println("out of stock");
                break;
             default:
                 System.out.println("You enter wrong code plz enter right code");
                 break;


        }

    }
    public void billDisplay(){
        System.out.println("******your bill*****");
        System.out.println( "codeNo  name  quantity  totalPrice");
        for (String s:item){
                if (s.equals("abc1")) {
                    System.out.println(s + "  " + "noodle" + "  " + noodleTotal + "           " + noodleTotalPrice);
                }
            else if (s.equals("abc2")){
                    System.out.println(s + "  " + "biscuit" + "  " + biscuitTotal + "           " +biscuitTotalPrice);
                }
        }
        System.out.println("------------------------------------------------------");
        System.out.println("                                     Total price=" +(biscuitTotalPrice+noodleTotalPrice));
    }
    public void remove(){

    }
}
