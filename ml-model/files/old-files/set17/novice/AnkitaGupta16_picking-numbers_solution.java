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
    public static int solve(List<Integer> a) {
    Collections.sort(a);
    int maxCount=0;
    int tempCount;
    for(int i=0;i<a.size();i++)
    {
        tempCount=1;
        for(int j=i+1;j<a.size();j++)
        {
            if((Math.abs(a.get(i)-a.get(j))==0) || (Math.abs(a.get(i)-a.get(j))==1))
            tempCount++;
        }
        if(maxCount<tempCount)
        maxCount=tempCount;
    }
    return maxCount;
    }
}
