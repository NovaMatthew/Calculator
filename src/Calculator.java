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
		System.out.println("Would you like to add or subtract?");
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
	}
}
