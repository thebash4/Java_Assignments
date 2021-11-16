import java.util.Scanner;


public class IdentifyWeekday {

	
	public static void main(String[] args) {
		
		int x;
		String a;
		Scanner scan= new Scanner(System.in);
		x=scan.nextInt();
		
		switch (x) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Not valid");
			break;
		}
		
		
		
		
	}
}
