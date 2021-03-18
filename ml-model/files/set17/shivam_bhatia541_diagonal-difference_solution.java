import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution {

    public static int solve(List<List<Integer>> arr) {
        int n=arr.size();
        int r=0,l=0;
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n;j++)
        {
            if(i==j)
            l=l+arr.get(i).get(j);
            if(i+j==n-1)
            r=r+arr.get(i).get(j);
        }
    }
    int h=Math.abs(l-r);
    return h;
    }

}
