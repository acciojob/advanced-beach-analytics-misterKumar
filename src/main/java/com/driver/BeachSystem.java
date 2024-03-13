package com.driver;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BeachSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Beach> beaches = new ArrayList<>();
        BeachAnalytics beachAnalytics = new BeachAnalytics();

        while (true) {
            printMenu();
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addBeach(scanner, beaches);
                    break;
                case 2:
                    displayBeaches(beaches);
                    break;
                case 3:
                    Beach mostPopular = beachAnalytics.findMostPopularBeach(beaches);
                    if (mostPopular != null)
                        System.out.println("Most Popular Beach: " + mostPopular.getName() + " with " + mostPopular.getYearlyVisitors() + " visitors annually.");
                    else
                        System.out.println("No beaches available.");
                    break;
                case 4:
                    Beach highestRated = beachAnalytics.findHighestRatedBeach(beaches);
                    if (highestRated != null)
                        System.out.println("Highest Rated Beach: " + highestRated.getName() + " with a rating of " + highestRated.getRating() + ".");
                    else
                        System.out.println("No beaches available.");
                    break;
                case 5:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }

    private static void printMenu() {
        System.out.println("1. Add Beach");
        System.out.println("2. Display Beaches");
        System.out.println("3. Find Most Popular Beach");
        System.out.println("4. Find Highest Rated Beach");
        System.out.println("5. Exit");
        System.out.println("Choose an option:");
    }

    private static void addBeach(Scanner scanner, List<Beach> beaches) {
    	//your code goes here
        scanner.nextLine();
        System.out.println("Enter beach details:");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Location: ");
        String location = scanner.nextLine();
        System.out.print("Yearly Visitors: ");
        int yearlyVisitors = scanner.nextInt();
        System.out.print("Rating: ");
        double rating = scanner.nextDouble();

        beaches.add(new Beach(name, location, yearlyVisitors, rating));
        System.out.println("Beach added successfully!");
    }

    private static void displayBeaches(List<Beach> beaches) {
    	//your code goes here
        System.out.println("Beaches:");
        for (Beach beach : beaches) {
            System.out.println(beach);
        }
    }
}

