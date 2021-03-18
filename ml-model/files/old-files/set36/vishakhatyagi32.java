import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {
        int n=p.length;
        int ans[]= new int[n];
        HashMap<Integer,Integer> map= new HashMap<Integer,Integer>();
        for(int i=0;i<n;i++)
        {
            map.put(p[i],i+1);
        }
        for(int temp=0;temp<n;temp++)
        {
            int ctr = map.get(temp+1);
            System.out.println(p[temp]+"----->"+ctr);
            ans[temp] = map.get(ctr);
        }



        return ans;
    }

}
