import java.util.Scanner;
  public class it24103112Lab4Q2 {
     public static void main (String [] args) {
       Scanner keyboard = new Scanner (System.in);

        System.out.println ("Enter the exam marks: ");

        int examMark = keyboard.nextInt();
        if (examMark >100 || examMark < 0) 
        {
            System.out.println("The exam marks are invalid");
        } 
        else
       {  
         System.out.println ("Enter the submission marks: ");
         int submissionMarks = keyboard.nextInt();
          
        if (submissionMarks > 100 || submissionMarks <0)
        {
             System.out.println("The lab marks are invalid");
        }
        else
        {

         System.out.println ("Enter the exam percentage marks: ");
          int examPercentage = keyboard.nextInt();
         System.out.println ("Enter the lab percentage: "); 
         int labpercentage = keyboard.nextInt();
            double final1ExamMarks * (examPercentage/100);
            double final1LabMarks = submissionMarks *(labpercentage / 100);
            double total1Marks =final1ExamMarks + final1LabMarks ;
             int totalMarks;

         if (totalMarks <= 100)
         {
            System.out.println("Final marrks are:"+ total1Marks);
         }
         else
         {
           System.out.println ("The pecentage does not add up "); 
         }
        }
       }
     }
  }