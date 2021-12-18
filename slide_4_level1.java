import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
    Scanner oper = new Scanner(System.in); // Scanner for sign (*, +, -, /)
    Scanner num = new Scanner(System.in);
    System.out.println("Enter the operation");
    char c = oper.next().charAt(0);
    System.out.println("Enter the two numbers (with a space in between)");
    int a = num.nextInt();
    int b = num.nextInt();
    
    switch (c){
      case '+':
        System.out.println(a+b);
        break; 
      case '-':
        System.out.println(a-b);
        break; 
      case '*':
        System.out.println(a*b);
        break; 
      case '/': 
        System.out.println(a/b);
        break; 
    }
    oper.close();
	}
}
