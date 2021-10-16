//Name:Akash Gher
//mini project : guess the number ad get the score
package com.AkashGher;
import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        // write your code here
        int myNumber= (int)(Math.random()*100);
        int userNumber=0;
        int attempt = 0;

        Scanner sc =new Scanner(System.in);
        do {
            attempt++;
            System.out.println("Guess my Number(1-100) and get score: ");
               userNumber = sc.nextInt();


            if(userNumber==myNumber){
                System.out.println("WOOHOO... CORRECT NUMBER!!!");

                break;

            }
            else if (userNumber>myNumber) {
                System.out.println("Your number is too large");

            }
            else{
                System.out.println("Your NUmber is too small");
            }


        }


        while (userNumber>=0);


        System.out.print("My Number was: ");
        System.out.println(myNumber);
        System.out.print("your total attempts: ");
        System.out.println(attempt);

        if(attempt<3){
            System.out.println("your score is 5 STAR ⭐⭐⭐⭐⭐");
        }
        else if(attempt<5){
            System.out.println("your score is 4 STAR ⭐⭐⭐⭐");

        }
        else if(attempt<8){
                System.out.println("your score is 3 STAR ⭐⭐⭐");

        }
        else if(attempt<10){
                System.out.println("your score is 2 STAR ⭐⭐");

                }
         else if(attempt<15){
                        System.out.println("your score is 1 STAR ⭐");

        }




    }
}
