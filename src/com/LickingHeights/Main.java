package com.LickingHeights;
import java.util.Scanner;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        int compInput = random.nextInt(3 - 1 + 1) + 1;
        /*System.out.println(compInput);*/
        Scanner keyboard = new Scanner(System.in);
        String name;
        System.out.println("What is your name?");
        name = keyboard.nextLine();
        System.out.println(name);
        int input;
        System.out.println("Pick 1 (Rock), 2 (Paper), or 3 (Scissors)");
        input = keyboard.nextInt();
        int userScore = 0;
        int compScore = 0;
        {


    }if (compInput  == 1){
            System.out.println("Rock");
        }
        else if (compInput == 2) {
            System.out.println("Paper");

        } else if (compInput == 3) {
            System.out.println("Scissors");

            if (input  == 1);
            System.out.println("Rock");

        }
        else if (input == 2) {
            System.out.println("Paper");

        } else if (input == 3) {
            System.out.println("Scissors");


        } if (compInput == 2 && input == 1) {

            System.out.println("You chose rock, computer chose paper ");
            System.out.println("You lose");


            } else if (compInput == 3 && input == 1) {
                System.out.println("You chose rock, computer chose scissors");
                System.out.println("You win");


                } else if (compInput == 3 && input == 2) {

                    System.out.println("You chose paper, computer chose scissors");
                    System.out.println("You lose");



                    }   else if (compInput == 1 && input == 2) {


                        System.out.println("You chose paper, computer chose rock");
                        System.out.println("You win");


                        } else if (compInput == 2 && input == 3) {

                            System.out.println("You chose scissors, computer chose paper");
                            System.out.println("You win");



                        } else if (compInput == 1 && input == 3) {

            System.out.println("You chose scissors, computer chose rock");
            System.out.println("You lose");


        } else if (compInput == 1 && input == 1) {

            System.out.println("You chose rock, computer chose rock");
            System.out.println("Draw!");

        } else if (compInput == 2 && input == 2) {

            System.out.println("You chose paper, computer chose paper");
            System.out.println("Draw!");

        } else if (compInput == 3 && input == 3){

            System.out.println("You chose scissors, computer chose scissors");
            System.out.println("Draw!");





        }}}
