package thefinal;

import java.util.Scanner;
public class Shelter {

	private static Scanner input;
	
	static void stayInShelter(){
	
		String choiceYes = null;
		String choiceNo = null;
		String quit = null;
		
		input = new Scanner(System.in);

		System.out.println(" 'You are really bored, but you see a pair of dice? Play Dice Yes or No'");
		choiceYes = input.nextLine();
		if("Yes".equals(choiceYes))
		{
			System.out.println("'You begin to play Farkle by yourself'");
		     
			int rollCount = 0;
	           do{ 
	              DiceGame.roll(); 
	               rollCount++;
	               System.out.println("To quit type No otherwise type Yes to play again.");
	               quit = input.nextLine();
	           }while ("Yes".equals(quit) ||"yes".equals(quit));
		
	        System.out.println("'After " + rollCount +" rolls you finally are bored and want to move on.'");
	        System.out.println("'I should go outside'");
	       
		}
		else
			if("No".equals(choiceNo))
				choiceNo = input.nextLine();
				System.out.println("'I should go outside'");
				Boy.leaveShelter();
				
		
}}
	
			

			missedCount++;
			System.out.println("You have missed the rabbit " + missedCount + " times if you get to 5 you die of starvation.");
			if(missedCount == 5)
			{
				System.out.println("You have starved to death. Good luck next time.");
				GameOver.displayOver();
			
				
			} 
			System.out.println("'Try again? Quit 999'");
			tryAgain = input.nextInt();
			}while(tryAgain != 999);
			SlenderManAppears.choice();
		}
		if(choice2 == 2)
		{
			System.out.println("'You go out to get sticks for the fire. Pick a number between 1 and 12 to see if you have a flame.'");
			do{
				System.out.println("Pick a number between 1 and 12 to see if you hit.");
				hunt = input.nextInt();
				if(hunt == total)
				{
					System.out.println("'You set up the trap and wait, then you see one. You got a rabbit! MMMMmhhh'");
					missedCount = 0;
					
				}
				
				missedCount++;
				System.out.println("You have missed the rabbit " + missedCount + " times if you get to 5 you die of starvation.");
				if(missedCount == 5)
				{
					System.out.println("You have starved to death. Good luck next time.");
					GameOver.displayOver();
					
					
				} 
				System.out.println("'Try again? Quit 999'");
				tryAgain = input.nextInt();
				}while(tryAgain != 999);
			System.out.println("' x '");
			System.out.println("'xxx'");
			System.out.println("Nice fire dude!");
			//create a random number generator to see if you can create a fire.
			SlenderManAppears.choice();
		}

	
