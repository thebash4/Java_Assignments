
	import java.util.Scanner;


public class factorial_value {

	
	public static void main(String[] args) {

		int i, fact=1;
		  int number;                        //It is the number to calculate factorial    
		  Scanner sc = new Scanner(System.in); // allows user to input number
		  number=sc.nextInt();                  //associates the input number with the number to calculate factorial
		  
		  for(i=1;i<=number;i++){    
		      fact=fact*i;    
		  }    
		  System.out.println("Factorial of "+number+" is: "+fact);    
		
		
		
		
		
		
	}
}
