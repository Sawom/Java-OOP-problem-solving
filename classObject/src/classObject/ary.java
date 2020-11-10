package classObject;
import java.util.Scanner;
public class ary {
	public static void main(String args[]) {
		Scanner input  = new Scanner(System.in);
		double number [] = new double[6];
		double sum = 0;
		
		double max =  number[0];
		double min = number[0];
		
		System.out.println("enter 5 numbers....");
		for(int i=1;i<6;i++) {
			number[i] = input.nextDouble();
			sum =sum+ number[i];
			if(number[i]>max) {
				max = number[i];
			}
			if(number[i]<min) {
				min = number[i];
			}
		}
		
		System.out.println("sum = "+sum);
		System.out.println("average = "+sum/number.length);
		System.out.println("maximum number = "+max);
		System.out.println("minimum number = "+min);
	}
}
