import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {
        int[] result = new int[p.length+1];
        int[] result1 = new int[p.length];
        for(int i=1;i<=p.length;i++){
            for(int j=0;j<p.length;j++){
                if(p[j]==i)
                    result[p[i-1]] = j+1;
            }
        }
        for(int i=0;i<p.length;i++)
            result1[i] = result[i+1];
        return result1;
    }

}
