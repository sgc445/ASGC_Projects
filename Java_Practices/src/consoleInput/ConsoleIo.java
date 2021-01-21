package consoleInput;

import java.util.Scanner;

/**
 * Created by sgc on 2/11/16.
 */
public class ConsoleIo {
    public static void main(String []args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter ur name:");
        System.out.println("My name is:" +s.nextLine());
        System.out.println("Enter ur age:" );
        System.out.println("My age is:" +s.nextInt());
        System.out.println("Enter the number to calculate factorial:");
        int value = s.nextInt();
        System.out.println("Factorial is:" +factorial(value));
    }

   public static int factorial(int num){
       int value =1;
       if (num==0){
           return value;
       }
       else{
           for (int i =1;i<=num;i++){
              value=value*i;
           }
       }
       return value;
   }

}
