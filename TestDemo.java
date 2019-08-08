import java.util.Scanner;

public class TestDemo {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in); 
	System.out.println("Enter a Number"); 
	int n = sc.nextInt(); 
	char digit = (char) n;
	
	if (n == 0) { 
		System.out.println("You Have Entered Zero");
		System.out.println("The ASCII value is: " + digit);
	} else if(n > 0){  
		System.out.println("You Have Entered Positive Value");   
		System.out.println("The ASCII value is: "  + digit);
	}else if(n < 0){  
		System.out.println("You Have Entered Negetive Value");   
		System.out.println("The ASCII value is: " + digit);
	}
	sc.close();
}
}

