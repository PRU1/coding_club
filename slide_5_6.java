import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    long first = 0; // long is used because it can store larger values than ints
	    long second = 1;
	    long third;
	    
	    System.out.print(first + " " + second + " ");
	    for (int i = 0; i < 50; ++i) // Repeat the loop 50 times
	    {
	        third = first + second;
	        first = second;
	        second = third;
	        System.out.print(third + " ");
	    }
	}
}
