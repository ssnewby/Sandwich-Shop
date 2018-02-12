package com.company;
import static java.lang.System.out;
import java.util.Scanner;

public class SandwichShop
{
    public static void main(String[] args)
    {
        // Don't change these lines.
        Scanner keyboard = new Scanner(System.in);
        int goalForVeggies = 50;
        int goalForBurgers = 250;
        int goalForSubs = 180;
        int goalForSoup = 70;

        int veggiesSold;
        int burgersSold;
        int subsSold;
        int soupsSold;

        //Veggie Sandwiches
        System.out.println("Checking sales goals.\n");
        System.out.println("The sales goal for veggie sandwiches today is 300.\n");
        System.out.println("How many veggie sandwiches were sold today? \n");
        veggiesSold = keyboard.nextInt();
        if( veggiesSold >= goalForVeggies)
        {
            System.out.println("Meets goal");
        }
        // not the most efficient way, but example to not do in the future
        else if(veggiesSold < goalForVeggies)
        {
            System.out.println("Fell short");
        }
        System.out.println("The sales goal for burgers is 250. \n");
        System.out.println("How many burgers were sold today? \n");
        burgersSold = keyboard.nextInt();
         if (burgersSold >= 250)
        {
            System.out.println("Meets goal");
        }
         else
        {
            System.out.println("Fell short");
        }
        System.out.println("The sales goal for subs is 180.\n");
        System.out.println("How many subs were sold today?\n");
        subsSold = keyboard.nextInt();
        if (subsSold >= goalForSubs)
        {
            System.out.print("Fell short \n");
        }
        System.out.println("The sales goal for soup is 70. \n");
        System.out.println("How many soups were sold today? \n");
        soupsSold = keyboard.nextInt();
        if (soupsSold >= goalForSoup)
        {
            System.out.println("Meets goal");
        }
        //correct way below that saves time and easier
        else
        {
            System.out.println("Fell short");
        }
        if (veggiesSold >= goalForVeggies && burgersSold >= goalForBurgers && subsSold >= goalForSubs &&
                soupsSold >= goalForSoup)
        {
            System.out.println("Made goal for everything");
        }
        }



}
