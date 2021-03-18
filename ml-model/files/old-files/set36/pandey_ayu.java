import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {
        int a[]=new int[p.length];
        int c=0,d=0,b=0;
    HashMap<Integer,Integer>map= new HashMap<Integer,Integer>();
    for(int i=0;i<p.length;i++)
    {
        map.put(p[i],i+1);
    }
    for(int i=1;i<=map.size();i++)
    {
      b=map.get(i);
      d=map.get(b);
      a[c++]=d;
    }
    return a;
    }

}
