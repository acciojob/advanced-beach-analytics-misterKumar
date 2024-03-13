package com.driver;

import java.util.List;

public class BeachAnalytics {
    public Beach findMostPopularBeach(List<Beach> beaches) {
    	//your code goes here
        Beach mostPopular = null;
        int maxVisitors = Integer.MIN_VALUE;
        for (Beach beach : beaches) {
            if (beach.getYearlyVisitors() > maxVisitors) {
                maxVisitors = beach.getYearlyVisitors();
                mostPopular = beach;
            }
        }
        return mostPopular;
    }

    public Beach findHighestRatedBeach(List<Beach> beaches) {
    	//your code goes here
        Beach highestRated = null;
        double maxRating = Double.MIN_VALUE;
        for (Beach beach : beaches) {
            if (beach.getRating() > maxRating) {
                maxRating = beach.getRating();
                highestRated = beach;
            }
        }
        return highestRated;
    }
}
