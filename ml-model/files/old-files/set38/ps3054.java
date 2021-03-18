import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {
        HashMap<Integer,Integer> Places = new HashMap<Integer,Integer>();
        for(int i=0;i<p.length;i++){
            Places.put(p[i]-1,i);
        }

        int[] Results = new int[p.length];

        for(int j=0;j<p.length;j++){
            Results[j]=Places.get((Places.get(j)))+1;
        }

        return Results;
    }

}
