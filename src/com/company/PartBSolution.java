package com.company;

import java.util.*;

class SiteStats {
    private String url;
    private int numVisits;

    /**
     * Constructor for the SiteStats class
     *
     * @param url
     *            String that represents an URL that the user has visited
     * @param numVisits
     *            An int that represents the number of times that the user has
     *            visited the url
     */
    public SiteStats(String url, int numVisits) {
        this.url = url;
        this.numVisits = numVisits;
    }

    /**
     * This method returns the number of times that the user has visited the url.
     *
     * @return An int that represents the number of times that the user has visited
     *         the url
     */
    public int getNumVisits() {
        return this.numVisits;
    }

    /**
     * This method returns the url that we are currently tracking
     *
     * @return A String that represents the url that we are currently tracking
     */
    public String getUrl() {
        return this.url;
    }


    public void setNumVisits(int updatedNumVisits) {
        this.numVisits = updatedNumVisits;
    }

    public String toString() {
        return this.url + " | " + this.numVisits;
    }
}

class SiteStatsComparator implements Comparator<SiteStats> {

    // Overriding compare()method of Comparator
    // for descending order of NumberOfVisits
    public int compare(SiteStats s1, SiteStats s2) {
        if (s1.getNumVisits() < s2.getNumVisits())
            return 1;
        else if (s1.getNumVisits() > s2.getNumVisits())
            return -1;
        return 0;
    }
}

public class PartBSolution {
    // Queue elements after sortIndex are
    // already sorted. This function returns
    // index of minimum element from front to
    // sortIndex
    public static int minIndex(Queue<SiteStats> list,
                               int sortIndex)
    {
        int min_index = -1;
        int min_value = Integer.MAX_VALUE;
        SiteStats min_node = list.peek();

        int s = list.size();
        for (int i = 0; i < s; i++) {
            SiteStats currentSiteStats = list.peek();
            int currentVisits = currentSiteStats.getNumVisits();

            list.poll();

            // we add the condition i <= sortIndex
            // because we don't want to traverse
            // on the sorted part of the queue,
            // which is the right part.
            if (currentVisits <= min_value && i <= sortIndex)
            {
                min_index = i;
                min_value = currentVisits;
                min_node = currentSiteStats;
            }
            list.add(currentSiteStats);
        }
        return min_index;
    }

    // Moves given minimum element
    // to rear of queue
    public static void insertMinToRear(Queue<SiteStats> list,
                                       int min_index)
    {
        int min_value = 0;
        SiteStats min_node = list.peek();
        int s = list.size();
        for (int i = 0; i < s; i++) {
            SiteStats currentSiteStats = list.peek();
            int currentVisits = currentSiteStats.getNumVisits();
            list.poll();
            if (i != min_index)
                list.add(currentSiteStats);
            else {
                min_node = currentSiteStats;
                min_value = currentVisits;
            }
        }
        list.add(min_node);
    }

    public static void sortQueue(Queue<SiteStats> list) {
        for(int i = 1; i <= list.size(); i++) {
            int min_index = minIndex(list,list.size() - i);
            insertMinToRear(list, min_index);
        }
    }

    //private static Queue<SiteStats> sites = new LinkedList<SiteStats>();
    private static PriorityQueue<SiteStats> sites = new
            PriorityQueue<SiteStats>(11, new SiteStatsComparator());


    // Main method to list top n visited sites
    public static void listTopVisitedSites(Queue<SiteStats> sites, int n) {
        sortQueue(sites);

        //access via new for-loop
        for (Object object : sites) {
            if (n > 0) {
                n--;
                SiteStats element = (SiteStats) object;
                System.out.print("URL: " + element.getUrl());
                System.out.println("  Visits: "+element.getNumVisits());
            } else
                return;
            //System.out.println("  Size "+ sites.size());
        }
    }

    // Method to find the website in the queue and increment the visited
    // count by 1, adding new node in case website is not found

    public static void updateCount(String url) {
        if(sites.isEmpty()) {
            sites.add(new SiteStats(url, 1));
        } else {
            //access via new for-loop
            for(Object object : sites) {
                SiteStats element = (SiteStats) object;
                if ((element.getUrl().equalsIgnoreCase(url))) {
                    element.setNumVisits(element.getNumVisits() + 1);
                    return;
                }
            }
            sites.add(new SiteStats(url, 1));
        }
    }


    public static void main(String[] args) {
        String[] visitedSites = { "www.google.co.in", "www.google.co.in", "www.facebook.com", "www.upgrad.com",
                                    "www.google.co.in", "www.youtube.com","www.facebook.com", "www.upgrad.com",
                                    "www.facebook.com", "www.google.co.in", "www.microsoft.com", "www.9gag.com",
                                    "www.netflix.com", "www.netflix.com", "www.9gag.com", "www.microsoft.com",
                                    "www.amazon.com", "www.amazon.com", "www.uber.com", "www.amazon.com",
                                    "www.microsoft.com", "www.upgrad.com" };

        for (String url : visitedSites) {
            updateCount(url);
        }

        listTopVisitedSites(sites, 5);
    }
}