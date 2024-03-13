package com.driver;

public class Beach {
    private String name;
    private String location;
    private int yearlyVisitors;
    private double rating;

    public Beach(String name, String location, int yearlyVisitors, double rating) {
        this.name = name;
        this.location = location;
        this.yearlyVisitors = yearlyVisitors;
        this.rating = rating;
    }

    public String getName() {
    	//your code goes here
        return name;
    }

    public String getLocation() {
    	//your code goes here
        return location;
    }

    public int getYearlyVisitors() {
    	//your code goes here
        return yearlyVisitors;
    }

    public double getRating() {
    	//your code goes here
        return rating;
    }

    @Override
    public String toString() {
    	//your code goes here
        return "Beach{name='" + name + "', location='" + location + "', yearlyVisitors=" + yearlyVisitors + ", rating=" + rating + '}';
    }
}
