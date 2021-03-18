import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {
    int[] result = new int[p.length];
    for(int i = 0;i< p.length ; i++)
   {
       int value = getArrayIndex(p, i + 1) ;
       int y = getArrayIndex(p, value);
       result[i] = y;
   }
   return result;
    }

    public static int getArrayIndex(int[] arr,int value) {
    for(int i=0;i<arr.length;i++)
        if(arr[i]==value) return i + 1;
    return -1;
}
}
