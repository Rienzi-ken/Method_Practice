/** 
 * To practice methods
 *
 * @author (Rienzi) 
 * @version (December 4) 
 */
import java.util.Scanner;

public class Method_Practice
{    
    static void iLikeCake() 
    {
        System.out.println("Yay! You're right!");
    }
    static void iDontLikeCake()
    {
        System.out.println("Yikers, not really true.");
    }
    static void iDontReallyCare()
    {
        System.out.println("Yikers, not really true.");
    }
    public static void main(String[] args)    
    {        
      System.out.println('\u000C');
      Scanner inputScanner = new Scanner(System.in);
      boolean cakeYes = true;
      boolean cakeNo = false;
      boolean cakeIDontCare = false;
      int decision;
      int decision2;
      String playAgain = "yes";
      
         while (playAgain.equals("yes") || playAgain.equals("Yes"))
      {
          System.out.println("Hey, I have a question for you to answer.");
          System.out.println("Do I like cake? What do you think?");
          System.out.println("Please answer either (1) for \"yes\",(2) for \"no\",or (3) for \"iDontCare\".");
          decision = inputScanner.nextInt();
          if (decision == 1)
          {
             System.out.println(cakeYes);
             iLikeCake();
             //next question
             System.out.println("Hello player, my name is Rienzi and I have a question for you.");
             System.out.println("Do I like chocolate cake? Please answer either (1) for \"yes\",(2) for \"no\",or (3) for \"iDontCare\".");
             decision2 = inputScanner.nextInt();
             //new if
             if (decision2 == 1)
             {
              System.out.println(cakeYes);
              iLikeCake();
             }
             else if (decision2 == 2)
             {
              System.out.println(cakeNo);
              iDontLikeCake();
             }
             else if (decision2 == 3)
             {
              System.out.println(cakeIDontCare);
              iDontReallyCare();
             }
             else
             {
               System.out.println("Welp, great job! PLEASE CHOOSE AN ACTUAL OPTION!");
             }
          }
          else if (decision == 2)
          {
             System.out.println(cakeNo);
             iDontLikeCake();
             //next question
             System.out.println("Do I like chocolate cake? Please answer either (1) for \"yes\",(2) for \"no\",or (3) for \"iDontCare\".");
             decision2 = inputScanner.nextInt();
             //new if
             if (decision2 == 1)
             {
              System.out.println(cakeYes);
              iLikeCake();
             }
             else if (decision2 == 2)
             {
              System.out.println(cakeNo);
              iDontLikeCake();
             }
             else if (decision2 == 3)
             {
              System.out.println(cakeIDontCare);
              iDontReallyCare();
             }
             else
             {
               System.out.println("Welp, great job! PLEASE CHOOSE AN ACTUAL OPTION!");
             }
          }
          else if (decision == 3)
          {
             System.out.println(cakeIDontCare);
             iDontReallyCare();
             //next question
             System.out.println("Do I like chocolate cake? Please answer either (1) for \"yes\",(2) for \"no\",or (3) for \"iDontCare\".");
             decision2 = inputScanner.nextInt();
             //new if
             if (decision2 == 1)
             {
              System.out.println(cakeYes);
              iLikeCake();
             }
             else if (decision2 == 2)
             {
              System.out.println(cakeNo);
              iDontLikeCake();
             }
             else if (decision2 == 3)
             {
              System.out.println(cakeIDontCare);
              iDontReallyCare();
             }
             else
             {
               System.out.println("Welp, great job! PLEASE CHOOSE AN ACTUAL OPTION!");
             }
          }
          else
          {
           System.out.println("Welp, great job! PLEASE CHOOSE AN ACTUAL OPTION!");
          }
          System.out.println("Do you want to try again?");
          System.out.println("Type yes or no");
          System.out.print("Your choice was:  ");
          playAgain = inputScanner.next();
      }
    }
}