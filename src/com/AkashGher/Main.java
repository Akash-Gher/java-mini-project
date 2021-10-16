package com.AkashGher;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
int myNumber= (int)(Math.random()*100);
int userNumber=0;
Scanner sc =new Scanner(System.in);
do{
    System.out.println("Guess my Number(1-100): ");
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
        System.out.println("My Number was: ");
        System.out.println(myNumber);




    }
}
