import java.util.Scanner; // Import scanner
public class Main { // Must include public for it to run in dmoj
  public static void main(String[] args) {
    Scanner hi = new Scanner(System.in); // Start scanner
    int B = hi.nextInt();
    int ans = (5 * B) - 400; // If unsure of operator precedence, use brackets
      System.out.println(ans);
    if (ans < 100){
      System.out.print("-1");
    }
    else if (ans == 100){
      System.out.print("0");
    }
    else {
      System.out.print("1");
    }

    hi.close(); // Close scanner
  }
}
