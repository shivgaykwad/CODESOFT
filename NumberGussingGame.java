package TASK1;

import java.util.Random;
import java.util.Scanner;

public class NumberGussingGame {
	static int maxattemp = 5;
	public static void main(String[] args) {
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		int score = 0;
		do {
			int randomNo = random.nextInt(100) + 1;
			boolean guesscorrect = false;
			int attemeps=0;
			System.out.println("I've generate a random number withing a 1 to 100");
			while(attemeps < maxattemp ) {
				System.out.println("Enter the guess number");
				int guess = sc.nextInt();
				attemeps++;
				if (randomNo == guess) {
					guesscorrect = true;
					System.out.println("greeet ! you win you are attentemp "+ attemeps);
					break;
				} else if(randomNo < guess){
					System.out.println("your number is so large ! try again");
				}else if(randomNo > guess){
					System.out.println("your number is so small"
							+ " .. ! try again");
				}
		    }
			 if (!guesscorrect) {
	                System.out.println("Sorry, you've used all your attempts. The correct number was: " + randomNo);
	            }

	            score += guesscorrect ? 10 : 0;

	            System.out.print("Do you want to play again? (yes/no): ");
	            String playAgain = sc.next().toLowerCase();

	            if (!playAgain.equals("yes")) {
	                break;
	            }
	        } while (true);
		 System.out.println("Thanks for playing! Your total score is: " + score +"/ 100");
	        sc .close();
	    }
	}