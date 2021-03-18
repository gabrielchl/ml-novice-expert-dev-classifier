import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int solve(int[] ar) {
        int max=ar[0],count=1;
        for(int i=1;i<ar.length;i++)
        {
            if(ar[i]>max)
             {count=1;max=ar[i];}
            else if(ar[i]==max)
            count++;
        }
        return count;

    }

}
