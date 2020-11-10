package TryCatchFinal;
import java.util.Scanner;
public class modify {
	public static void main(String[] args) {
		///  program close hobe na...coltei thakbe r input nibe
		
		while(true) {
			try{
				Scanner input = new Scanner(System.in);
				System.out.println("please input two integer numbers...");
				int num1 = input.nextInt();
				int num2 = input.nextInt();
				int result = num1/num2;
				System.out.println("result = "+result);
			}catch(Exception e){
				System.out.println("Exception : please input two integer numbers..."+e);
			}
			finally{
				System.out.println("the end...");
			}
		}
		
	}
}
