package thefinal;

import java.util.Scanner;

public class MainClass {

	public static void Start() {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int choice;
		
		System.out.println("Are you a boy(1) or a girl(2)>>> ");
		choice = input.nextInt();
		
		if (choice == 1)
		{
			Boy.boy();
		}
		if (choice == 2)
		{
			Girl.girl();
		}
		
		{
		
	}

}}
