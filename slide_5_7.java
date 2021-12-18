public class Main
{
	public static void main(String[] args) {
	    int counter = 0; // This variable keeps track of how many times the digit has appeared;
	 for (int i = 1; i <= 2009; ++i){
	     // Split number into digits
	     int temp = i;
	     while (temp > 0){
	         int digit = temp % 10;
	         if (digit == 8){
	             ++counter; 
	         }
	         temp /= 10;
	     }
	 }
	 System.out.println("The digit 8 appears " + counter + " time(s) between 1 and 2009");
	 
	}
}
