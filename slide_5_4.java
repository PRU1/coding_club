import java.util.Scanner;
import java.lang.Math; // Used for sqrt
public class Main
{
	public static void main(String[] args) {
   
    Scanner hi = new Scanner(System.in);
    int input = hi.nextInt();
    
    if (input % 2 == 0){
        System.out.println("Not prime");
    }
    else {
    boolean prime = true;
    for (int q = 3; q <= Math.sqrt(input); q += 2){ // Factors are the same but reverse after the square root of a number. Stopping at the sqrt makes the program faster
        if (input % q == 0){
            prime = false;
        }
    }
        if (prime == true){
            System.out.print("Prime");
        }
        else {
            System.out.print("Not prime");
        }
    }
	}
}
