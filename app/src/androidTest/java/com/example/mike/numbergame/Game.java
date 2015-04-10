package com.example.mike.numbergame;

import static java.lang.System.out;

import java.util.Scanner;

import java.util.Random;
/**
 * Created by Mike on 10/04/15.
 */
public class Game {


        public static void main(String args[]){

            Scanner keyboard = new Scanner(System.in); //this is where you get the input system.in is the keyboard.


            out.print("Enter any number from 1 to 10: ");


            int inputNo = keyboard.nextInt();

            int randomNo = new Random() .nextInt(2) + 1; // the number in the brackets is the number of possibilities from which the random number can be chosen.


            if (inputNo == randomNo) {

                out.println(" ***************");

                out.println(" *** YOU WIN ***");

                out.println(" ***************");

            } else {

                out.println("******************");

                out.println("**** YOU LOSE ****");

                out.println("******************");

                out.println("* The Number was *");

                out.println("******* " + randomNo + " *******");

            }

        }



    }
}
