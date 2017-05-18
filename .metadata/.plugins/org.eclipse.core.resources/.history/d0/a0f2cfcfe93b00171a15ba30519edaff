package thefinal;

import java.util.Scanner;

public class Shelter {

	private static Scanner input;
	static void stayInShelter()
	{
		String choiceYes = null;
		int leave = 0;
		String quit = null;
		
		input = new Scanner(System.in);
		do{
		System.out.println(" 'You are really bored, but you see a pair of dice? Play Dice Yes or No'");
		choiceYes = input.nextLine();
		if("Yes".equals(choiceYes))
		{
			System.out.println("'You begin to play Farkle by yourself'");
		     
	           int rollCount = 0;
	           do {
	              DiceGame.roll(); 
	               rollCount++;
	               System.out.println("To quit type No otherwise type Yes to play again.");
	               quit = input.nextLine();
	           } while ("Yes".equals(quit) ||"yes".equals(quit));
	         
	        System.out.println("'After " + rollCount +" rolls you finally are bored and want to move on.'");
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
		int hunt;
		int fire= 0;
		int total = 0;
		int tryAgain;
		int thisMany = 0;
		int missedCount = 0;
		System.out.println("'You realize you are very hungry, what do you want to do? Go hunt(1) or make fire(2)?'");
		choice = input.nextInt();
		if(choice == 1)
		{
			System.out.println("'You find a stick and sharpen it. You see a rabbit and throw your spear thingy.'");
			//random number generator
			do{
			System.out.println("Pick a number between 1 and 12 to see if you hit.");
			hunt = input.nextInt();
			rollHunt(total);
			if(hunt == total)
			{
				System.out.println("'You set up the trap and wait, then you see one. You got a rabbit! MMMMmhhh'");
			}
			
			missedCount++;
			System.out.println("You have missed the rabbit " + missedCount + " times if you get to 5 you die of starvation.");
			if(missedCount == 5)
			{
				System.out.println("You have starved to death. Good luck next time.");
				GameOver.displayOver();
				MainClass.main(null);
				
			} 
			System.out.println("'You missed the rabbit. Maybe a trap would be better. Try again? Quit 999'");
			tryAgain = input.nextInt();
			}while(tryAgain != 999);
		
		}
		if(choice == 2)
		{
			System.out.println("'You go out to get sticks for the fire.'");
			System.out.println("' x '");
			System.out.println("'xxx'");
			System.out.println("Nice fire dude!");
		}
	
	}
	 public static void rollHunt(int total)
	 {
		 int die1, die2;
		 die1  = (int)(Math.random()*6) + 1;
	     die2 = (int)(Math.random()*6) + 1;
	     total = die1 + die2;
	     System.out.println(total);
		
	 }
}