/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Carter I. Walker
 */

package org.example;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        //Necessary Variables
        Scanner input = new Scanner(System.in);
        double height, weight;
        double bmi;

        //Query for height and weight
        System.out.println("Note: If you do not enter the information correctly, you will not be allowed to continue.");
        System.out.println("Please enter your height in inches:");
        height = input.nextInt();

        System.out.println("Please enter your weight in pounds:");
        weight = input.nextInt();


        //Calculation
        bmi = (weight / (height * height)) * 703;

        //Output
        if (bmi < 18.5)
        {
            System.out.format("According to our calculations, your BMI (%.1f) registers you as underweight, we recommend you consult your doctor.", bmi);
        }
        else if (bmi > 25)
        {
            System.out.format("According to our calculations, your BMI (%.1f) registers you as overweight, we recommend you consult your doctor.", bmi);
        }
        else
        {
            System.out.format("According to our calculations, your BMI (%.1f) registers you in the ideal weight range!", bmi);
        }
    }
}
