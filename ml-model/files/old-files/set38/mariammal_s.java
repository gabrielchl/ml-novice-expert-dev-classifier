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
        for (int i = 0; i < p.length;i++)
        {
            int a = p[i];
            result[a] = i+1;
        }
        for(int i=1; i<result.length; i++)
        {
            int y=result[i];
            p[i-1]=result[y];
        }
    return p;
    }

}
