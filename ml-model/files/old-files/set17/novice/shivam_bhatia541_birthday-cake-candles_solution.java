import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int solve(int[] ar) {
        int max=ar[0],count=0;
        for(int i=1;i<ar.length;i++){
            if(ar[i]>=max)
            {
                max=ar[i];
            }
        }
        for(int i=0;i<ar.length;i++){
            if(ar[i]==max)
            count++;
        }
        return count;
    }

}
