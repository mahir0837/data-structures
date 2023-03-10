package com.sarac;

public class BigOSingleLoop {
    public static void main(String[] args) {
        long numberOfOperations=0;
        int n=100;// size of  Data

        long startTime;
        long endTime;
        System.out.println("Input size n is = "+ n);

        // Task 1 Single Loop................... O(n)

        startTime=System.currentTimeMillis();
        for(int i=0;i<n;i++){
            numberOfOperations+=1;



        }
        endTime=System.currentTimeMillis();
        System.out.println("Number Of Operations = " + numberOfOperations+" in "+(endTime-startTime)+" miliseconds");
        numberOfOperations=0;
        // Task 2 Nested Loops...................
        startTime=System.currentTimeMillis();
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++) {
                numberOfOperations+=1;
            }
        }
        endTime=System.currentTimeMillis();
        System.out.println("Number Of Operations = " + numberOfOperations+" in "+(endTime-startTime)+" miliseconds");


        // Task 2 End...................
// ......................................................................................................
        // Task 3 Three Nested Loops...................


        // Task 3 End...................
// ......................................................................................................
        // Task 4 N and M Nested Loops  O(n*m)...................

        // Task 4 End...................

        // Task 4.5 N and M Consecutive Loops O(n+m)...................

        // Task 4.5 End...................

        // Task 5 Logarithmic Complexity...................

       // Task 5 End...................*/
    }
}