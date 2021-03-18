import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] circularArrayRotation(int[] a, int k, int[] queries) {
        int[] rotatedArray = new int[a.length];
        int[] queriesResult = new int[queries.length];

        for (int i = 0; i<a.length; i++){
            int rotations = k%a.length;
            if (i + rotations >= a.length){
                rotatedArray[i + rotations -a.length] = a[i];
            }else{
                rotatedArray[i+ rotations] = a[i];
            }
        }

        int j = 0;
        for (int q : queries){
            queriesResult[j] = rotatedArray[q];

            j++;
        }

        return queriesResult;
    }

}
