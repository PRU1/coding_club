import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner hi = new Scanner(System.in);
	    System.out.println("Enter the starting number");
	    int x = hi.nextInt();
	    
	    for (int i = 0; i < 1000; ++i){
	        if (x % 2 == 0){
	            x /= 2;
	        }
	        else{
	            x = 3*x + 1;
	        }
	        System.out.print(x + " ");
	    }
	    hi.close();
	}
}
