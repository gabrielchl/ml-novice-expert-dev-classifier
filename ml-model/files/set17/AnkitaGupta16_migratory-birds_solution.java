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

    static int solve(List<Integer> arr) {
       int max=arr.get(0);
       for(int i=1;i<arr.size();i++)
            if(arr.get(i)>max)
                max=arr.get(i);
        int[] temp= new int[max];
        for(int i=0;i<max;i++)
            temp[i]=0;
        for(int i=0;i<arr.size();i++)
            temp[arr.get(i)-1]++;

        int value=temp[0];
        int valuePos=0;
        for(int i=1;i<max;i++)
            if(temp[i]>value)
             {
                 value=temp[i];
                 valuePos=i;
             }
        return (valuePos+1);
    }

}
