import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
   
    for (int i = 0; i <= 10; ++i){ // Each time the outer loop iterates, it starts a new rom
        for (int n = 10; n >= i; --n){ // Start with 10 stars, then reduce by one every time. Run untl the amount of stars outputted is the row number, i
            System.out.print("*");
        }
        System.out.println(); // Start a new line
    }
	}
}
