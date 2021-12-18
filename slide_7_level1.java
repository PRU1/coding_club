import java.util.Scanner;
import java.util.Arrays;
public class Main
{
	public static void main(String[] args) {
	  Scanner input = new Scanner(System.in); 
	  String alkali[] = {"Li", "Na", "K", "Rb", "Cs", "Fr", "Be"}; // 1+ charge
	  String alkali_earth[] = {"Be", "Mg", "Ca", "Sr", "Ba", "Ra"}; // 2+ charge
	  String group_16[] = {"O", "S", "Se"}; // 2- charge (not including all of them here)
	  String group_17[] = {"F", "Cl", "Br", "I"}; // 1- charge (not including all of them here)
	  int anion_charge = 1;
	  int cation_charge = 1;
	  String cation = "";
	  String anion = "";
	  int temp1 = 0, temp2 = 0;
	  System.out.println("Enter a salt equation (i.e. NaCl");
	  String salt = input.nextLine();
	  
	  if (Character.isUpperCase(salt.charAt(0)) == false){
	      System.out.println("Invalid input. First letter not capitalized");
	  } 
	  // Determine charges of anion and cation
	  else {
          String[] r = {""};
          r = salt.split("(?=\\p{Upper})"); // Split string by uppercase (using regex) Note: if you plan on doing senior ccc, researching regex might be helpful
          int x = r[0].length()-1;
          int y = r[1].length()-1;
          if (Character.isDigit(r[0].charAt(x)) == true){
              cation_charge = Character.getNumericValue(r[0].charAt(x));
          }
          else if (Character.isDigit(r[1].charAt(y)) == true){
               anion_charge = Character.getNumericValue(r[0].charAt(y));
          }
        for (int z = 0; z < r[0].length(); ++z){
            if (Character.isDigit(r[0].charAt(z)) == true);
            else {
                cation += r[0].charAt(z);
            }
        }
         for (int z = 0; z < r[1].length(); ++z){
            if (Character.isDigit(r[1].charAt(z)) == true);
            else {
                anion += r[1].charAt(z);
            }
        } 
       
       if (Arrays.asList(alkali).contains(cation) == true){
           temp1 = 1;
       }
       else if (Arrays.asList(alkali_earth).contains(cation) == true){
           temp1 = 2;
       }
       else {
           System.out.println("You have entered an element not in our cation element arrays. Please check your spelling");
       }
       if (Arrays.asList(group_16).contains(anion) == true){
           temp2 = 2;
       }
       else if (Arrays.asList(group_17).contains(anion) == true){
           temp2 = 1;
       }
       else {
           System.out.println("You have entered an element not in our anion element arrays. Please check your spelling");
       }
       if (temp1*cation_charge == temp2*anion_charge){
           System.out.println("This equation follows the zero sum rule");
       }
       else {
           System.out.println("This equation does not follow the zero sum rule");
       }
	  }
	  /* For debugging
	  System.out.println(cation_charge);
	  System.out.println(anion_charge);
	  System.out.println(cation);
	  System.out.println(anion);
	  System.out.println(temp1);
	  System.out.println(temp2);
	  */
	}
}
