import java.util.Scanner;

public class Calculator 
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		Scanner bc = new Scanner(System.in);
		System.out.println("Enter two whole numbers...");
		float input = sc.nextFloat();
		float input2 = sc.nextFloat();
		System.out.println("Would you like to add, subtract, multiply or divide these values?");
		String calculate = bc.nextLine();
		if(calculate.equalsIgnoreCase("add"))
		{
			float add = input + input2;
			System.out.println(add);		
		}
		else if (calculate.equalsIgnoreCase("subtract"))
		{
			float subtract = input - input2;
			System.out.println(subtract);		
		}
		else if(calculate.equalsIgnoreCase("multiply"))
		{
			float mult = input * input2;
			System.out.println(mult);
		}
		else if(calculate.equalsIgnoreCase("divide")) 
		{
			if(input2 == 0)
			{
			System.out.println("Error: Divide by Zero");
			}
			else 
			{
			float divide = input / input2;
			System.out.println(divide);
			}
		}
	}
}
