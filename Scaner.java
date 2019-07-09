
package scaner;
import java.util.Scanner;

public class Scaner {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int number1, number2, sum;
    System.out.print("Enter first integer");
    number1 = input.nextInt();
    number2 = input.nextInt();
    sum = number1 + number2;
    System.out.println("Sum is " +sum);
    }
    
}
