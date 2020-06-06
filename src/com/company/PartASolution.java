package com.company;

import java.util.Stack;

public class PartASolution {

    private static Stack<String> history = new Stack<String>();

    /* isBrowsingHistoryEmpty(): method checking if the browsing history
        is empty or not

        Returns: Boolean
     */

    public static Boolean isBrowsingHistoryEmpty() {
        // Add CODE BELOW
        if(history.isEmpty())
            return true;
        else
            return false;
    }

    /* mostRecentlyVisitedSite(): Method returning the url of
            the website that the user most recently visited
       Void method
     */

    public static String mostRecentlyVisitedSite() {
        // Add CODE BELOW
        if(!isBrowsingHistoryEmpty())
            return history.peek();
        else
            return null;
    }

    /*
        addSiteToHistory(): Adds a website url to the browsing history
        @params: String url defining the url of the site to be added to
        the history
        Void method
     */

    public static void addSiteToHistory(String url) {
        // Add CODE BELOW
        history.add(url);
    }

    /*  goBackInTime(): Removes the n most recently websites
        from the browsing history
        @params: primitive int n defining the numbers of websites to be removed
        Void method
     */

    public static void goBackInTime(int n) {
        // Add CODE BELOW
        while(n>0 && !history.isEmpty()){
            history.pop();
            n--;
        }
    }

    /*
        printBrowsingHistory(): Prints out all of the website urls
        in the browsing history to the command prompt
        Void method
     */

    public static void printBrowsingHistory() {
        // Add CODE BELOW
        //A temp stack to traverse through the stack
        Stack<String> tempStack = history;

        if (tempStack.isEmpty())
            System.out.println("Browsing history is empty");
        else {
            while (!history.isEmpty())
                System.out.println(tempStack.pop());
        }
    }

    public static void main(String[] args) {
        System.out.println(isBrowsingHistoryEmpty()); // Checking if Browsing History is Empty
        addSiteToHistory("www.google.co.in"); // Navigating to Google
        addSiteToHistory("www.facebook.com"); // Navigating to Facebook
        addSiteToHistory("www.upgrad.com"); // Navigating to UpGrad
        System.out.println(isBrowsingHistoryEmpty()); // Checking if Browsing History is Empty
        System.out.println(mostRecentlyVisitedSite()); // Fetching most recently visited site (UpGrad)
        addSiteToHistory("www.youtube.com"); // Navigating to Youtube
        goBackInTime(2); // Going back by 2 sites
        addSiteToHistory("www.yahoo.com"); // Navigating to UpGrad platform site
        System.out.println(mostRecentlyVisitedSite()); // Fetching most recently visited site (UpGrad Learn Platform)
        printBrowsingHistory(); // Printing browsing history

    }

}

/**
 * Your code should have the following Output:
 * <p>
 * true
 * false
 * www.upgrad.com
 * www.yahoo.com
 * [www.google.co.in, www.facebook.com, www.yahoo.com]
 */

