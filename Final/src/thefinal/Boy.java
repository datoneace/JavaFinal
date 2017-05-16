package thefinal;
import java.util.Scanner;
public class Boy {
		// TODO Auto-generated method stub
		public static void boy() {
		int choice;
	Scanner input = new Scanner(System.in); 
	System.out.println("						");	
	System.out.println(" You wake up in the middle of the woods, confused. It was just begining to get dark. It was silent."); 
	System.out.println("You dont know where you are or how you got there. You begin to slowly walk around trying to take in your surroundings. ");
	System.out.println("After about 10 minutes of walking you look up and see a man in the distance. You run towards him calling out."); 
	System.out.println("When you turn around you see he has no face.  ");
	System.out.println("						");	
	System.out.println("What do you do: type 1 to run away, 2 to fight him, 3 to talk to him, or 4 to find a weapon.>>");	
	choice = input.nextInt();
	
	if (choice == 1)
	{
		System.out.println("						");	
		System.out.println("You quickly turn around full of fear. You begin to run as hard and as fast as you can. You look back to see you are not being followed. You saftly made it away.");	
	}
	if (choice == 2)
	{
		System.out.println("						");	
		System.out.println("You try to attack the man, realizing that he is much bigger then you. You struggle to get him to the ground until he throws you off. There's no chance you win. You run away.  ");	
	}
	if (choice == 3)
	{
		System.out.println("						");	
		System.out.println(" 'what is your name?' you yelled to him. 'where am I!' You stood waiting for a reply. He stood like a statue. He didnt say a word. You got scared, slowly turned around, and ran away. ");	
	}
	if (choice == 4)
	{
		System.out.println("						");	
		System.out.println("You franticaly look around, looking for anything to protect yourself. You find a stick on the ground with a sharp end. You try to lunge at the man with it but he punches you in the throat. You runaway in terror.");	
	}

	System.out.println("You continued to run for what felt like an forever. You had to been running for at leaste an hour. You where miles form where you had been.");
	System.out.println("You stopped, out of breath and kinda dizzy. You looked around to make sure the man was no where to be seen. You were safe. All you see is trees.");
	System.out.println(" ' how big is this forrest' you thought to yourself. There was no sign of civilization anywhere. You begin to feel raindrops start to fall.  ");
	System.out.println("						");	
	System.out.println("What do you do: 1 for continue running, or 2 for stop and find shelter for the night. >>");	
	choice = input.nextInt();
	
	if (choice == 1)
	{
		System.out.println("						");	
		System.out.println("You continue running for about another hour. The rain is now pouring and your soaked. Your tired and beigning to feel dizzy.");
		System.out.println(" You try to continue pushing but you trip over a tree root and hit your head. Your knocked out.  ");		
	}
	if (choice == 2)
	{
		System.out.println("						");	
		System.out.println("You can feel the rain starting to pick up. You find a heavy cluster of trees with overlapping leaves." );
		System.out.println(" You go under them and lay down. The rain is barley hitting you because of all the leaves. Your exausted. The moment you closed your eyes you driffted asleep. ");	
	}
	
	System.out.println("						");	
	System.out.println(" You slowly feel yourself waking up. Your eyes are still shut but everything feels different. Its not wet and cold anymore. ");	
	System.out.println(" It's warm and dry. You slowly open your eyes. Its so bright it takes a minute for your eyes to adjust. You see that your in a room. ");
	System.out.println(" 'how did I get here?'");
	System.out.println(" 'What should you do now, leave the shelter 1, stay in shelter 2'");
	choice = input.nextInt();
	if(choice== 1)
	{
		Shelter.leaveShelter();
	}
	if(choice == 2)
	{
		Shelter.stayInShelter();
	}
}
static void displayThis()
{ 
		
	}

}
