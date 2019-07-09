
package if_statement2;
import java.util.Scanner;
public class If_statement2 {

    public static void main(String[] args) {
        Scanner input = new Scanner( System.in);
      System.out.print("Enter a number(between 1 and 4):  ");
      int num = input.nextInt();
      switch (num){
          case 1: System.out.println("One");break;
          case 2: System.out.println("Two");;break;
          case 3: System.out.println("Three");;break;
          case 4: System.out.println("Four");;break;
          default:  System.out.println("out of range");
    }
    
}
