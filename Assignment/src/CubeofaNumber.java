import java.util.Scanner;


public class CubeofaNumber {
	
	
	public static void main(String[] args) {

		  int number;  
		  System.out.println("Enter a number: ");    
		  Scanner sc = new Scanner(System.in); // allows user to input number
		  number=sc.nextInt();     
		  
		  System.out.println("Cube of entered number is: "+ (number*number*number));
	}
}
