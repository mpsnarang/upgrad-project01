package com.company;

import java.util.*;

public class QHighestToEnd {

    static Queue<Integer> q = new LinkedList<Integer>();

    public static void func() {
        //write your code here
        int iSizeQ = q.size();
        int iCounter = 0;
        int iTempHighest = Integer.MIN_VALUE;

        while(iCounter<iSizeQ){
            if(iTempHighest < q.peek())
                iTempHighest = q.peek();

            q.add(q.remove());
            iCounter++;
        }

        q.remove(iTempHighest);
        q.add(iTempHighest);

    }

    public static void main(String arg[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int j = 0; j < n; j++) {
            q.add(in.nextInt());
        }
        func();
        System.out.println(q);
    }

}
