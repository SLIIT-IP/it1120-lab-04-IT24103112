import java.util.Scanner;
  public class it24103112Lab4Q1 {
     public static void main (String [] args) {
       Scanner keyboard = new Scanner (System.in);

       System.out.println ("Enter the number you want to compare: ");
       long comparenumber = keyboard .nextInt();
       
       if (comparenumber == 0)
       {
         System.out.println("The number you entered is zero");
       }
       else if (comparenumber <0)
       {
        System.out.println("The number you entered is negative");
       }
       else
       {
        System.out.println("The number you entered is positive");

       }
     }
  }