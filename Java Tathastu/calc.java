import java.util.Scanner;
public class calc{
    public static void main(String args[]) {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter value of 1st no");
     int a=sc.nextInt(); 
     System.out.println("Enter value of 2nd no");
     int b=sc.nextInt(); 
     System.out.println("Enter 'a' for addition, 's' for subtraction, 'm' for multiplication, 'd' for divide");
     char ch =sc.next().charAt(0); 
     switch(ch){
     case 'a':
     System.out.println("Sum of the two numbers is "+(a+b));
     break;
     case 's':
     System.out.println("Difference of the two numbers is "+(a-b));
     break;
     case 'm':
     System.out.println("Product of the two numbers is "+(a*b));
     break;
     case 'd':
     System.out.println("Division of the two numbers is "+(a/b));
     break;
     default:
     System.out.println("Enter a valid operator");
     
     }
    }
}