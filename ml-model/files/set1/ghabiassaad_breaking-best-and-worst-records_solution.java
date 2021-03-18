import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int[] getRecord(int[] s)
{
    int highest, lowest;
    highest = lowest = s[0];
    
    int[] result = new int[2];
    
    for (int s_i = 1; s_i < s.length; s_i++)
    {
        if (s[s_i] > highest)
        {
            highest = s[s_i];
            ++result[0];
        }
        else if (s[s_i] < lowest)
        {
            lowest = s[s_i];
            ++result[1];
        }
    }
    
    return result;
}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }
        int[] result = getRecord(s);
        String separator = "", delimiter = " ";
        for (Integer val : result) {
            System.out.print(separator + val);
            separator = delimiter;
        }
        System.out.println("");
    }
}
