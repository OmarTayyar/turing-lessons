package module01;

import java.util.Random;
import java.util.Scanner;

public class numberguessgame {
    public static void main(String[] args) {
        guessgame();
    }
    public static void guessgame(){
        Random rand = new Random();
        int guess;
        int number = rand.nextInt(100);
        int numberoftries = 0;
        while(numberoftries < 10){
            numberoftries++;
            System.out.println("Guess the number between 1 and 100 : ");
            Scanner sc = new Scanner(System.in);
            guess = sc.nextInt();
            if(guess == number){
                System.out.println("You guessed the number");
                break;
            }
            else if(guess < number){
                System.out.println("Your guess is  lower than the number");
            }
            else if(guess > number){
                System.out.println("Your guess is higher than the number");
            }
        }
        if(numberoftries == 10){
            System.out.println("Unfortunately you lose the game please try again");
        }

    }
}
