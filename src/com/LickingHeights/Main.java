package com.LickingHeights;
import java.util.Scanner;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        int compPick = (int)(Math.random()*100);
        Scanner keyboard = new Scanner(System.in);
        String name;
        System.out.println("What is your name?");
        name = keyboard.nextLine();
        System.out.println(name);
        int input;
        int compInput;
        System.out.println("Pick 0 (Rock), 1 (Paper), or 2 (Scissors)");
        input = keyboard.nextInt();
        int userScore;
        int compScore;
        boolean loop = true;
        while (loop){




        if (input == 0) ;
        System.out.println("Rock");

            {
                if (input == 1) ;
                System.out.println("Paper");

                {
                    else if (input == 2) ;
                    System.out.println("Scissors");

                } else if (compInput == 1 && input == 0) ;

                    System.out.println("You chose rock, computer chose paper ");
                    System.out.println("You lose");
                    compScore = compScore +1;
                    break;


                }
                else if (compInput == 2 && input == 0) ;
                System.out.println("You chose rock, computer chose scissors");
                System.out.println("You win");
                userScore = userScore +1;
                break;
            }
                else if (compInput == 2 && input == 1);

            System.out.println("You chose paper, computer chose scissors");
            System.out.println("You lose");
            compScore = compScore +1;
            break;


            {   else if (compInput == 0 && input == 1);

            System.out.println("You chose paper, computer chose rock");
            System.out.println("You win");
            userScore = userScore +1;
            break;

            {
                 else if (compInput == 1 && input == 2);

                System.out.println("You chose scissors, computer chose paper");
                System.out.println("You win");
                userScore = userScore +1;
                break;

                {   else if (compInput == 0 && input == 2);

                System.out.println("You chose scissors, computer chose rock");
                System.out.println("You lose");
                compScore = compScore +1;
                break;


}}}}}





