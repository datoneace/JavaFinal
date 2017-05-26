package thefinal;

import java.util.Scanner;

public class endScreen {

	public static void End() {
		// TODO Auto-generated method stub
		// Default screen after game is finished 
		Scanner input = new Scanner(System.in); 
		
		int choice;
		
		System.out.println("**************************************");	
		System.out.println("*             You Died               *");
		System.out.println("*            GAME OVER               *");	
		System.out.println("*                                    *");
		System.out.println("*            What Now?               *");
		System.out.println("*            1 = restart             *");
		System.out.println("*            2 = Dice Game           *");
		System.out.println("*            3 = Quit                *");
		System.out.println("*            4 = Rate The Game       *");
		System.out.println("**************************************");	
		choice = input.nextInt();
		if ( choice == 1)
		{
			MainClass.displayMain();
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
		if (choice == 4)
		{
			Array.displayArray1();
		}
		
	}


		// TODO Auto-generated method stub
		public static void End2() {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in); 
		
		int choice;
		
		System.out.println("**************************************");	
		System.out.println("*             You Died               *");
		System.out.println("*            GAME OVER               *");	
		System.out.println("*                                    *");
		System.out.println("*            What Now?               *");
		System.out.println("*            1 = restart             *");
		System.out.println("*            2 = Dice Game           *");
		System.out.println("*            3 = Quit                *");
		System.out.println("*            4 = Rate The Game       *");
		System.out.println("**************************************");	
		choice = input.nextInt();
		if ( choice == 1)
		{
			DisplayClear.clearDisplay();
			
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
		if (choice == 4)
		{
			Array.displayArray1();
		}
		
		
	}
	}


