import java.util.ArrayList;
import java.util.Scanner;
/** A simple game of rock paper sicissors
 * World best game 
 *  @author Sukhjinder Nahal
 */

public class rockPaperScissors {

	public static void main(String[] args) {

		String rock = "rock";
		String paper = "paper";
		String scissors = "scissors";
		int userWins = 0;
		int userLosses = 0;
		int computerWins = 0;
		int computerLosses = 0;
		int numOfRounds = 0;
		int ties = 0;
		
		
		ArrayList<String> list = new ArrayList<String>(3);
		list.add(rock);
		list.add(paper);
		list.add(scissors);
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Choose Rock, Paper Sicissors or exit");
		String input = keyboard.nextLine();
		
		
		
		while(!input.equalsIgnoreCase("exit"))
		{
			double randomNum = Math.floor((Math.random() * 3));
			String computerChoice = list.get((int) randomNum);
			
			System.out.println("Computer's Choice: " + computerChoice);
			
			if(input.equalsIgnoreCase(computerChoice))
			{
				System.out.println("Tie");
				ties++;
			}
			
			else if (input.equalsIgnoreCase(paper) & computerChoice.equals(rock))
			{
				System.out.println("You have won these game ");
				userWins++;

				computerLosses++;
			}
			
			else if (input.equalsIgnoreCase(rock) & computerChoice.equals(paper))
			{
				System.out.println("Computer wins");
				computerWins++;
				userLosses++;
			}
			
			else if (input.equalsIgnoreCase(rock) & computerChoice.equals(scissors))
			{
				System.out.println("You win");
				userWins++;
				computerLosses++;
			}
			
			else if (input.equalsIgnoreCase(scissors) & computerChoice.equals(rock))
			{
				System.out.println("Computer wins");
				computerWins++;
				userLosses++;
			}
			
			else if (input.equalsIgnoreCase(paper) & computerChoice.equals(scissors))
			{
				System.out.println("Computer wins");
				computerWins++;
				userLosses++;
			}
			
			else if (input.equalsIgnoreCase(scissors) & computerChoice.equals(paper))
			{
				System.out.println("You win");
				userWins++;
				computerLosses++;
			}
			
			else{
				System.out.println("Invalid Input");
			}
			
			numOfRounds++;
			
			System.out.println("Choose Rock, Paper, Sicissors or exit");
			input = keyboard.nextLine();
			
		}
		
		keyboard.close();
		
		System.out.println("The number of wins for the user = " + userWins + "\n" +
				           "The number of wins for the computer = " + computerWins + "\n" +
				           "The number of losses for the user = " + userLosses + "\n" +
				           "The number of losses for the computer = " + computerLosses + "\n" +
				           "The number of ties = " + ties + "\n" + 
				           "The number of rounds = " + numOfRounds);
	}

}
