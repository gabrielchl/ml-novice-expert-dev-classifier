import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {

        int n = p.length;
        int[] results = new int[n];

        for(int i=0; i<n ; i++)
        {
            for(int j=1; j<= n ; j++)
            {
                if(p[p[j-1]-1]==i+1)
                    {
                        results[i]=j;
                    }
            }
        }
        return results;

    }

}
