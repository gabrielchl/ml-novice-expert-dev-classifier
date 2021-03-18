import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] circularArrayRotation(int[] a, int k, int[] queries) {
        int rot = k % a.length;
        int firstPos = a.length - rot;
        int newArPos = 0;
        int[] ar = new int[a.length];
        for (int j = firstPos; j< a.length; j++) {
            ar[newArPos] = a[j];
            newArPos++;
        }
        for (int t = 0; t < firstPos;t++) {
            ar[newArPos] = a[t];
            newArPos++;
        }
        for (int m = 0;m<ar.length;m++) {
            System.out.println("ar = "+ m + " = "+ar[m]);
        }
        int[] newArr = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int pos = queries[i];
            // int act = 0;
            // int mainPos = pos+firstPos;
            // if (mainPos >= a.length) {
            //     act = a.length-mainPos;
            // } else {
            //     act = mainPos;
            // }
            newArr[i] = ar[pos];
        }
        return newArr;
    }

}
