import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(Integer[] p) {
    int ar[]=new int[p.length];
    int ind=0;
    int ans=0;
    for(int i=1;i<=p.length;i++)
    {
    ind=(Arrays.asList(p).indexOf(i))+1;
    System.out.println(ind+" "+i+" "+p[i-1]);

    ans=Arrays.asList(p).indexOf(ind)+1;
    System.out.println(ans+" "+i);

    ar[i-1]=ans;
    }

return ar;
    }

}
