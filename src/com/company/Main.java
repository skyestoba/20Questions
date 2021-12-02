package com.company;
import java.util.Objects;
import java.util.Scanner;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int roboNum = (int)(Math.random()*100);
        extracted(roboNum);
        System.out.println("You win!");
        System.out.println("Do you want to play again?");
        Scanner scan = new Scanner(System.in);
        String ans = scan.nextLine();
        if(Objects.equals(ans, "yes")){
            extracted(roboNum);
        }
        if (Objects.equals(ans, "no")) {
            System.out.println("Good game friend <3");
        }
    }

    private static void extracted(int roboNum) {
        System.out.println("Enter a number between 1 and 100!");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();


        while (roboNum != num){
            if (num > roboNum){
                System.out.println("Too high, guess again!");
                extracted(roboNum);
                break;
            }

            if (num < roboNum){
                System.out.println("Too low, guess again!");
                extracted(roboNum);
                break;
            }
        }
    }


}






