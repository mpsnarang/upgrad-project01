package com.company;

public class ArrayProblem {
    public static void main(String args[]) {

        int matrix[][];
        matrix = new int[4][4];

        System.out.println(matrix.length);

        int i, j;

        /* Updating first column */
        for (i = 0; i < matrix.length; i++) {
            matrix[i][0] = i;
        }

        /* Updating first row */
        for (j = 0; j < matrix[0].length; j++) {
            matrix[0][j] = j;
        }

        for (i=1;i<matrix.length;i++){
            for(j=1;j<matrix.length;j++){
                matrix[i][j]= Math.max(matrix[i][j-1], matrix[i-1][j]);
            }

        }

      	/* Write your loop here to update the above matrix such that
      	each cell is max of its neighbouring cell.
      	Store your results in the matrix itself*/



        /* Printing 2D matrix. Don't change the code below*/
        for (i = 0; i < matrix.length; i++) {
            for (j = 0; j < matrix[0].length; j++)
                System.out.print(matrix[i][j]);
            System.out.print('\n');
        }
    }
}
