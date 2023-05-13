package Arrays;
/*
Given two sorted integer arrays, find the median of the arrays.

Example:
Input = [1, 2, 3] and [4, 5]
Output = 3

Example:
Input = [0, 1] and [2, 3]
Output = 1.5

*/

public class IntArraysMedianFinder  {
    
    public static String solution(String input) {

        String [] inputs = input.substring(1, input.length()-1).split("\\] and \\[");

        String [] arr1 = inputs[0].split(", ");
        String [] arr2 = inputs[1].split(", ");

        int[] intArr1 = new int[arr1.length];
        int[] intArr2 = new int[arr2.length];

        for(int i = 0; i< arr1.length; i++)
            intArr1[i] = Integer.parseInt(arr1[i]);

        for(int i = 0; i< arr2.length; i++)
            intArr2[i] = Integer.parseInt(arr2[i]);

        int combined[] =new int[intArr1.length + intArr2.length];
        System.arraycopy(intArr1, 0, combined, 0, intArr1.length);
        System.arraycopy(intArr2, 0, combined, intArr1.length, intArr2.length);

        if(combined.length%2 == 1)
            return String.valueOf(combined[combined.length/2]);

        else
            return String.valueOf(((double)(combined[combined.length/2] + combined[(combined.length/2) - 1]))/2);
    }

    public static void main(String[] args){
        System.out.print(solution("[1, 2, 3] and [4, 5]"));
    }
}

