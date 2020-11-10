package TryCatchFinal;
import java.util.Scanner;
public class ExceptionProblem {
	public static void main(String[] args) {
		int count =0; /// input 2 ta valid hole program close hobe
		
		do {
			try{
				Scanner input = new Scanner(System.in);
				System.out.println("please input two integer numbers...");
				int num1 = input.nextInt();
				int num2 = input.nextInt();
				int result = num1/num2;
				System.out.println("result = "+result);
				count =2;
			}catch(Exception e){
				System.out.println("Exception : please input two integer numbers..."+e);
			}
			finally{
				System.out.println("the end...");
			}
		}while(count ==1);
		
	}
}
