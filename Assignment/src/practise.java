import java.util.Scanner;


public class practise {

 public static void main (String[]args){
	
	 int x;
	 Scanner scan = new Scanner(System.in);  //allows user to enter value
	 System.out.println("Enter a value");  
     x = scan.nextInt(); //connects variable x with the user entered value

     
	 if (x>=0) {
		System.out.println("Output:Positive");
	}
	 else {
		System.out.println("Output:Negative");
	}
 }
	
}
