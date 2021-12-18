public class Main
{
	public static void main(String[] args) {
	   int yay[] = {1,3,43,345};
	   int avg = 0; // Variable to store average
	   int max = yay[0]; // Varible to stare largest element
	   int min = yay[0]; // Varible to stare smallest element
	   
	   for (int i = 0; i < yay.length; ++i){
	       // Find the largest element
	       if (yay[i] > max){
	           max = yay[i];
	       }
       // Find the smallest element
	       else if (yay[i] < min){
	           min = yay[i];
	       }
	       avg += yay[i];
	   }
	   
	   System.out.println("The smallest element in the array is: " + min);
	   System.out.println("The greatest element in the array is: " + max);
	   System.out.println("The average of the array is " + avg/yay.length);
	   
	   System.out.println("The elements of the array are: ");
	   for (int x : yay){
	       System.out.print(x + " ");
	   }
	}
}
