import java.util.Scanner;

public class Calculator 
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two whole numbers...");
		int input = sc.nextInt();
		int input2 = sc.nextInt();
		int output = input + input2;
	System.out.println(output);		
	}
}
