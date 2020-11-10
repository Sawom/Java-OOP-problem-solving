package userDefinedSample;  ///10 er opor input dile exception throw korbe
import java.util.Scanner;
public class mainClass {
	public static void main(String[] args) {
		
		while(true) {
			try {
				System.out.println("Enter a number...");
				Scanner input=new Scanner(System.in);
				int num = input.nextInt();
				if(num>10) {
					throw new NewException();
				}
				
			}catch(NewException e) {
				System.out.println("Number can not be greater than 10"); // eikhaner msg ta ashe na 
			}
		}
		
	}
}

class NewException extends Exception{
	public NewException(){
		System.out.println("Number can not be greater than 10..."); // eikhaner msg ta ashbee
	}
}
