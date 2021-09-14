/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 ROBERT MCQUEEN
 */
import java.util.Scanner;
public class legalDrivingAge {

    public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.print("What is your age? ");
int age = sc.nextInt();

if(age >= 16){
    System.out.print("You are old enough to drive.");
}else
    System.out.print("You are not old enough to drive.");


    }
}
