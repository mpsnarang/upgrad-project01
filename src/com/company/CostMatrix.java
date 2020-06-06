package com.company;
import java.util.Scanner;

public class CostMatrix {

    private static int min(int x, int y, int z) {
        if (x < y)
            return (x < z)? x : z;
        else
            return (y < z)? y : z;
    }


    private static int minCost(int cost[][], int m, int n) {
        int minCost[][]=new int[m+1][n+1];
        /* Initialise the first column of the minimum cost (table) array */
        /* Initialise the first row of the table array */
        /* Construct the rest of the table array from the recursion relation */
        minCost[0][0] = cost[0][0];

        for(int x = 1; x <= m; x++){
            minCost[x][0] = minCost[x-1][0] + cost[x][0];
        }

        for(int y = 1; y <= m; y++){
            minCost[0][y] = minCost[0][y-1] + cost[0][y];
        }

        for(int x = 1; x <= m; x++){
            for(int y = 1; y <= m; y++){
                minCost[x][y] = min(minCost[x-1][y-1],minCost[x-1][y],minCost[x][y-1])+cost[x][y];
            }
        }
        return minCost[m][n];
    }

    public static void main(String args[]){
        int cost[][]= {{1, 2, 3},
                {4, 8, 2},
                {1, 5, 3}};
        Scanner scan = new Scanner(System.in);
        int xCoordinate = scan.nextInt();
        int yCoordinate = scan.nextInt();
        System.out.println(minCost(cost,xCoordinate,yCoordinate));
    }




}
