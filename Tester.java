import java.io.*;
import java.util.Scanner;

public class Tester 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter your fighters. Only two to a fight");
		Scanner kbReader =  new Scanner(System.in);
		try
		{
			String s1 = kbReader.nextLine();
			String s2 = kbReader.nextLine();
			Fighter f1 = new Fighter(s1);	
			Fighter f2 = new Fighter(s2);
		}
		catch(IOException e)
		{
			System.out.println("This is not a valid fighter name. Try again.");
		}
	}
}
