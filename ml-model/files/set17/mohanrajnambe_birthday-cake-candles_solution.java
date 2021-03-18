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
        int max=ar[ar.length-1],c=0;
        for(int i=ar.length-1;i>=0;i--){
            if(ar[i]==max)
                c++;
            else
                return c;
        }
        return c;

    }
}
