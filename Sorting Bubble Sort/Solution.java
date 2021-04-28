import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }
    
    // Complete the countSwaps function below.
    static void countSwaps(int[] a) {
        int cnt = 0;
        boolean swapped = true;
        while(swapped == true){
            swapped = false;
            for(int i=0;i<a.length-1;i++){
                if(a[i] > a[i+1]){
                    int temp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = temp;      
                    cnt++;
                    swapped = true;
                }
            }
        
        }
        
        System.out.println("Array is sorted in " + cnt + " swaps.");
        System.out.println("First Element: " + a[0]);
        System.out.println("Last Element: " + a[a.length - 1]);
        
    }
    
    

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        countSwaps(a);

        scanner.close();
    }
}
