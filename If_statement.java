
package if_statement;
import java.util.Scanner;

public class If_statement {

    public static void main(String[] args) {
      Scanner in = new Scanner( System.in);
    
      System.out.println("Enter an 3 integer numbers:  ");
      int n1= in.nextInt();
      int n2= in.nextInt();
      int n3= in.nextInt();
      int max=0;
      if (n1 > n2 && n1 > n3)max=n1;
      if (n2 > n1 && n2 > n3)max=n2;
      if (n3 > n1 && n3 > n2)max=n3;
      System.out.printf("The maximum number is %d \n",max);
      
      
      
      
      
      
    }
    
}
