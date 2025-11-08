package _01Basics;

import java.util.Arrays;

public class _05Array {
   public static void main(String[] args) {
       int arr[] = new int[5];

       System.out.println(arr.getClass().getName());

       int arr1[] = {3, 7 , 2, 9, 1};

       Arrays.sort(arr1);

       for(int e : arr1) System.out.print(e + " ");
       System.out.println();
       System.out.println(Arrays.equals(arr, arr1)); 
   }
}
