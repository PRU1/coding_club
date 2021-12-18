import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
    // y = x^2
    for (int i = 0; i <= 100; ++i){
        System.out.print((i*i) + (" "));
    }
    // y = 1/x
    System.out.print("\n\n"); // Print out blank line. The first \n ends the current line from the loop above
    for (double i = 0; i <= 50; ++i){
        System.out.print((1/i) + (" "));
    }
    
    System.out.print("\n\n"); // Print out blank line
    for (int i = 0; i <= 10; ++i){
        System.out.print((Math.pow(4,i)) + (" ")); // Math.pow is for exponents. (4,1) means 4 to the exponent of i
    }
	}
}
