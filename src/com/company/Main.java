package com.company;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Random random = new Random();
        // random number in strings
        System.out.println("First random int is "+ random.nextInt(10));
        System.out.println("First double is "+ random.nextDouble());

        // random number in a range +1

        int min = 5;
        int max = 10;
        int newRandom = random.nextInt((max - min)+1)+min;
        System.out.println(newRandom);



        // random number in a range repeated
        Scanner input = new Scanner(System.in);
        System.out.println("how many do you want?");
        int wantedNumbers = input.nextInt();
        System.out.println("What is your minimum number");
        int min = input.nextInt();
        System.out.println("What is your maximum number");
        int max = input.nextInt();

        for(int i=0;i != wantedNumbers+1;i++){
            int newRandom = random.nextInt(max - min)+ min;
            System.out.println(newRandom);
        }
        
    }
}
