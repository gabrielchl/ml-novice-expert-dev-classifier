import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int solve(int n, int[] ar) {
        boolean[] container=new boolean[101];
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(!container[ar[i]])
                container[ar[i]]=true;
            else
            {
                count++;
                container[ar[i]]=false;
            }
        }
        return count;
    }

}
