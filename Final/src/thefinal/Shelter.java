package thefinal;

import java.util.Scanner;

public class Shelter {

	private static Scanner input;
	static void stayInShelter()
	{
		String choiceYes = null;
		int leave = 0;
		input = new Scanner(System.in);
		do{
		System.out.println(" 'You are really bored, but you see a pair of dice? Play Dice Yes or No'");
		choiceYes = input.nextLine();
		if("Yes".equals(choiceYes))
		{
			System.out.println("'You begin to play Farkle by yourself'");
		     
	           DiceGame dice = new DiceGame();  
	           int rollCount = 0;
	           do {
	               dice.roll();
	               System.out.println("The dice come up " + dice.getDie1() 
	                                                + " and " + dice.getDie2());
	               rollCount++;
	           } while (dice.getTotal() != 2);
	        System.out.println("\nIt took " + rollCount + " rolls to get a 2.");
	        System.out.println("'After a few rolls you finally win.'");
	        System.out.println("'I should go outside'");
		}
		
		
		
		else
		System.out.println("'Would you like to leave? Yes or No'");
		}while("Yes".equals(leave));
		leaveShelter();
		leave = input.nextInt();
	}
	static void leaveShelter()
	{     
		int choice = 0;
		int hunt = 0;
		int fire;
		
		System.out.println("'You realize you are very hungry, what do you want to do? Go hunt or make fire?'");
		if(choice == hunt)
		{
			
		}
	}
}