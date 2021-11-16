import java.util.Scanner;


public class vowel {
 public static void main(String[] args) {
	char a;
	int i=0;
	Scanner scan= new Scanner(System.in);
	System.out.println("Enter a letter");
	a = scan.next().charAt(0);
	
	
	
	switch (a) {
	case 'a':
	case 'e':
	case 'i':
	case 'o':
	case 'u':
	case 'A':
	case 'E':
	case 'I':
	case 'O':
	case 'U':i++;
	}
		if (i==1)	
		System.out.println("Entered letter " + a + " is a vowel");
		
		else
			if((a>='a'&&a<='z')||(a>='A'&&a<='Z'))
				System.out.println ("Entered character "+a+" is Consonent");
			else
				System.out.println("Not an alphabet");
	}
	
	
}

