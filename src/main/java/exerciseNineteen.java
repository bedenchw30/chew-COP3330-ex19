/**
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 beden chew
 */
import java.util.Scanner;
public class exerciseNineteen {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("What is your weight in pounds? ");
        double weight= input.nextDouble();

        System.out.print("What is your height in inches? ");
        double height = input.nextDouble();

        double BMI = ((weight/(height*height)) * 783);

        System.out.println("Your BMI is " + Math.round(BMI*10)/10.0 + ".");

        if(BMI >=18.5 && BMI <= 25){
            System.out.println("You are within the ideal weight range ");
        }
        else if(BMI <18.5){
            System.out.println("You are underweight. You should see your doctor.");
        }
        else
            System.out.println("You are overweight. You should see your doctor.");
    }
}
