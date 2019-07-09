
package ifwithswitch;
import java.util.Scanner;
public class IfWithSwitch {
    public static void main(String[] args) {
       Scanner input; int score; char grade;
       input = new Scanner(System.in);
       System.out.print("Enter your score: ");
       score = input.nextInt();
       if (score < 0 || score > 100)
           System.out.println("Invalid score");
       else {
           switch (score / 10){
               case 10:
               case 9:
                   grade = 'A'; break;
               case 8:
                   grade = 'B'; break;
               case 7:
                   grade = 'C'; break;
               case 5:
               case 6:
                   grade = 'D'; break;
               default:
                   grade = 'F'; break;
           }
           System.out.println("Grade is " + grade);
       }
      
       
    }
    
}
