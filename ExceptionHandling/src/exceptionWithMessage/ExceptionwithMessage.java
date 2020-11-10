package exceptionWithMessage; ///10 er opor input dile exception throw korbe
import java.util.Scanner;		// with message
public class ExceptionwithMessage{
	public static void main(String[] args) {
		
		while(true) {
			try {
				System.out.println("Enter a new number...");
				Scanner input=new Scanner(System.in);
				int num = input.nextInt();
				if(num>10) {
					throw new NewException("Number can not be greater than 10"); // ekhane ja likhbo print hobe exception e 
				}
				
			}catch(NewException e) {
				e.printStackTrace();
			}
		}
		
	}
}

class NewException extends Exception{
	public NewException(String message){
		super(message); 
	}
}