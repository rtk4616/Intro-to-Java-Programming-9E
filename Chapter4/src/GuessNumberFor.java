/*
 * This is the last method reinterpreted using a for loop
 * For loop implementation is just to show that it works
 * The code isn't too clear, but is fully functional
 */

import java.util.Scanner;
public class GuessNumberFor {
		public static void main(String[] args) {
			int number = (int)(Math.random() * 100); //0 - 100
			Scanner input = new Scanner(System.in);
			System.out.println("Try to guess the number between 0 and 100");

			for (int guess = -1; guess != number; guess = input.nextInt()){	
				if (guess > number){
					System.out.println("Your guess is too high");
				}
				else if (guess >= 0){
					System.out.println("Your guess is too low");
				}
				System.out.println("\nEnter your guess: ");
			}
			System.out.println("Correct, the number is: " + number);

		}
	}

