/*
 *  UCF COP3330 Fall 2021 Assignment 8 Solution
 *  Copyright 2021 Josh Boada
 */

import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        Scanner people = new Scanner(System.in);
        System.out.println("How many people?");
        String peoplenum = people.nextLine();

        Scanner pizzas = new Scanner(System.in);
        System.out.println("How many pizzas do you have?");
        String pizzanum = pizzas.nextLine();

        Scanner slices = new Scanner(System.in);
        System.out.println("How many slices per pizza?");
        String slicenum = slices.nextLine();

        int Peoples = Integer.parseInt(peoplenum);
        int Pizzas = Integer.parseInt(pizzanum);
        int Slices = Integer.parseInt(slicenum);

        int sliceperpizza = Pizzas * Slices;
        int sliceperperson = sliceperpizza / Peoples;
        int leftover = sliceperpizza % Peoples;

        System.out.println(Peoples + " people with " + Pizzas + " pizzas (" + sliceperpizza + " slices)");
        System.out.println("Each person gets " + sliceperperson + " pieces of pizza.");
        System.out.println("There are " + leftover + " leftover pieces.");
    }
}