import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static public void solve(int[] arr){

        long min,max,cont;
        min = max =  cont = 0;

        Arrays.sort(arr);

        for(int i=0; i<arr.length-1; i++){

            min+=arr[i];
        }

        for(int i=arr.length-1; i>0; i--){

            max+=arr[i];
        }


        System.out.print(min+" "+ max);

    }

}
