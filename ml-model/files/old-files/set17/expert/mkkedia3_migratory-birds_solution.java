import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int solve(List<Integer> arr) {
        List<Integer> fre=new ArrayList<Integer>();
        List<Integer> ele=new ArrayList<Integer>();
        /*for(int i=0;i<arr.size()-1;i++)
        {
            for(int j=0;j<arr.size()-i-1;j++)
            {
                if(arr.get(j)>arr.get(j+1))
                {
                    int tmp=arr.get(j);
                    arr.set(j,arr.get(j+1));
                    arr.set(j+1,tmp);
                }
            }
        }*/
        Collections.sort(arr);
        int c=0;
        int old=arr.get(0);
        ele.add(arr.get(0));
        fre.add(1);
        for(int i=1;i<arr.size();i++)
        {
            if(arr.get(i)!=old)
            {
                old=arr.get(i);
                ele.add(arr.get(i));
                fre.add(1);
                c++;
            }
            else
            {
                fre.set(c,fre.get(c)+1);
            }
        }
        int me=0,mf=0;
        for(int i=0;i<fre.size();i++)
        {
            if(fre.get(i)>mf)
            {
                mf=fre.get(i);
                me=ele.get(i);
            }
        }
        return me;
    }

}
