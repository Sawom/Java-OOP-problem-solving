package throwThrows;
import java.util.Scanner;
public class ThrowThrows{
	public static void main(String[] args) throws NewException { // throws method er baire boshe
		
		while(true) {
				System.out.println("Enter a new number...");
				Scanner input=new Scanner(System.in);
				int num = input.nextInt();
				if(num>10) {
					throw new NewException("Number can not be greater than 10"); //  ekhane ja likhbo print hobe exception e 
				} // throw method er vitor e  boshe
		}
	}
}

class NewException extends Exception{
	public NewException(String message){
		super(message); 
	}
}
