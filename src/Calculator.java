import java.util.Scanner;

public class Calculator 
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		Scanner bc = new Scanner(System.in);
		System.out.println("Enter two whole numbers...");
		int input = sc.nextInt();
		int input2 = sc.nextInt();
		System.out.println("Would you like to add, subtract, multiply or divide these values?");
		String calculate = bc.nextLine();
		if(calculate.equalsIgnoreCase("add"))
		{
			int add = input + input2;
			System.out.println(add);		
		}
		else if (calculate.equalsIgnoreCase("subtract"))
		{
			int subtract = input - input2;
			System.out.println(subtract);		
		}
		else if(calculate.equalsIgnoreCase("multiply"))
		{
			int mult = input * input2;
			System.out.println(mult);
		}
		else if(calculate.equalsIgnoreCase("divide")) 
		{
			int divide = input / input2;
			System.out.println(divide);
		}
		
	}
}
