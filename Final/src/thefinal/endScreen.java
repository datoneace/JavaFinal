package thefinal;

import java.util.Scanner;

public class endScreen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in); 
		
		int choice;
		
		System.out.println("**************************************");	
		System.out.println("*            GAME OVER               *");	
		System.out.println("*                                    *");
		System.out.println("*            What Now?               *");
		System.out.println("*            1 = restart             *");
		System.out.println("*            2 = Dice Game           *");
		System.out.println("*            3 = Quit                *");
		System.out.println("**************************************");	
		choice = input.nextInt();
		if ( choice == 1)
		{
			MainClass.main(args);
		}
		if ( choice == 2)
		{
			DiceGame.DiceGame();
		}
		if ( choice == 3)
		{
			System.out.println("***************************");
			System.out.println("** Thank You For Playing **");	
			System.out.println("**       Good Bye        **");
			System.out.println("***************************");
		}
		
	}

}
