package com.company;
import java.util.Scanner;
import java.util.Random;

public class RockPaperScissorGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Random random = new Random();
        System.out.println("Rock Paper Scissors Game");
        System.out.println("Enter your choice:");
        System.out.println("0=Rock");
        System.out.println("1=Paper");
        System.out.println("2=Scissors");
        int userchoice = sc.nextInt();
        int computerChoice = random.nextInt(3);
        String[] choice = {"Rock" , "Paper" , "Scissors"};
        System.out.println("You chose:" + choice [userchoice]);
        System.out.println("Computer choice:" + choice[computerChoice]);
        if (userchoice==computerChoice) {
            System.out.println("It's a Tie");
        }
        else if ((userchoice==0 && computerChoice ==2)|| (userchoice==1&& computerChoice ==0) || (userchoice==2 && computerChoice ==1)) {
            System.out.println("You win!");
        }
        else {
            System.out.println("Computer wins!");
        }
        sc.close();
    }

}
