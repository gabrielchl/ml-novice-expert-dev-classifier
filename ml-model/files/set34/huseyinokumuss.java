import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] circularArrayRotation(int[] a, int k, int[] queries) {
         int [] sonuc = new int[queries.length];
        int []  temp = new int[a.length];
        for(int i=0; i<a.length;i++){
            temp[(i+k)%a.length] = a[i];
        }

        for(int j=0;j<queries.length;j++){
            int indis = queries[j];
            sonuc[j]= temp[indis];
        }
        return sonuc;

    }

}
