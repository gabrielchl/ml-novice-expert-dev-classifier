import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {

        int output[]=new int[p.length];
        ArrayList<Integer> list= new ArrayList<Integer>();
        for(int i=0;i<p.length;i++)
        {
          list.add(new Integer(p[i]));
        }


        for(int i=1;i<=p.length;i++)
        {
           // System.out.println(list.indexOf(list.indexOf(i)+1)+1);
        output [i-1] = list.indexOf(list.indexOf(i)+1)+1;
        }
    return output;


    }

}
