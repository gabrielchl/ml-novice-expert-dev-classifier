import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {
            ArrayList<Integer> t=new ArrayList<Integer>();
            int[] y=new int[p.length];
            for(int i=0;i<p.length;i++)
            {
                t.add(p[i]);
            }
            for(int i=1;i<=t.size();i++)
            {
                int ind=t.indexOf(i)+1;
                int inde=t.indexOf(ind)+1;
                y[i-1]=inde;
            }
    return y;
    }

}
