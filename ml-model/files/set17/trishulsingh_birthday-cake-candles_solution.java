import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int solve(int[] ar) {
        Arrays.sort(ar);
        int total=0;
        int max=ar[ar.length-1];
        for(int i=0;i<ar.length;i++){
            if(max==ar[i]){
                total=total+1;
            }
        }
        return total;

    }

}
