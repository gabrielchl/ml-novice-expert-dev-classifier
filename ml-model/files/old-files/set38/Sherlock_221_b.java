import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p)
    {
        Hashtable <Integer,Integer>h=new Hashtable<Integer,Integer>();
        for(int i=0;i<p.length;i++)
        {
            if(!h.containsKey(p[i]))
            {
                h.put(p[i],i+1);
            }
        }
        int q[]=new int[p.length];
        for(int i=0;i<p.length;i++)
        {
            q[i]=h.get(h.get(i+1));
        }
        return q;


    }

}
