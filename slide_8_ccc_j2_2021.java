import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	 Scanner strings = new Scanner(System.in);
	 int N = Integer.parseInt(strings.nextLine());
	 int bids[] = new int[N];
	 String bidders[] = new String[N];
	 int max = 0;
	 int temp = 0;
	 
	 for (int i = 0; i < N; ++i){
	     bidders[i] = strings.nextLine();
	     bids[i] = Integer.parseInt(strings.nextLine());
	     if (max < bids[i]){
	         max = bids[i];
	         temp = i;
	     }
	 }
	 strings.close();
	 System.out.println(bidders[temp]);
	}
}
