import java.util.Scanner;

class Input
{
	public static void main(String[]args)
	{
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int n = s.nextInt();
		System.out.println("Entered value : " + n);
	}
}

