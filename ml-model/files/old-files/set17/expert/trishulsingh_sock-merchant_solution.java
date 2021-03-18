import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int solve(int n, int[] ar) {
        int counter=0;
        Arrays.sort(ar);
        for (int i=0;i<n-1;i++){
            if(ar[i]==ar[i+1]){
                counter++;
                i++;
            }
        }
        return counter;


    }

}
