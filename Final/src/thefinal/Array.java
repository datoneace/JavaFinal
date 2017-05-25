package thefinal;

import java.util.Scanner;

public class Array {

	public static void displayArray1(){
		// TODO Auto-generated method stub
		// uses an array to show what you think of the game
		int choice;
		Scanner input = new Scanner(System.in);  
		
		double[] menu = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9,};
		String[] listOfMenu = {"the worst", " sucked","terrible", "Bad", "meh", "decent", " good", "amazing", "Best thing Ever"};
		System.out.println("on a scale of 0-9 how would you rate the game?");
		choice = input.nextInt();
		System.out.println(menu[choice] + " = " + listOfMenu[choice]);
		System.out.println("Thank You for rating our game.");
	}
	
}
