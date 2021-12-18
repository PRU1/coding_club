import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	   Scanner arrayInput = new Scanner(System.in);
	   System.out.println("Enter the number of elements");
	   int numOfElements = arrayInput.nextInt();
	   int yay[] = new int[numOfElements];
	   // Get user input
	   for (int i = 0; i < numOfElements; ++i){
	       yay[i] = arrayInput.nextInt();
	   } 

	   int avg = 0; // Variable to store average
	   int max = yay[0]; // Varible to stare largest element
	   int min = yay[0]; // Varible to stare smallest element
	   
	   for (int i = 0; i < yay.length; ++i){
	       // Find the largest element
	       if (yay[i] > max){
	           max = yay[i];
	       }
	       else if (yay[i] < min){
	           min = yay[i];
	       }
	       avg += yay[i];
	   }
	   
	   System.out.println("The smallest element in the array is: " + min);
	   System.out.println("The greatest element in the array is: " + max);
	   System.out.println("The average of the array (rounded) is " + avg/yay.length);
	   System.out.print("The elements of the array are: ");
	   
	   for (int x : yay){ // Print out elements in the array
	       System.out.print(x + " ");
	   }
	}
}
