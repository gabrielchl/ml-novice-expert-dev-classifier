import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {


        ArrayList<Integer> list = new ArrayList<Integer>();
        int a[]=new int [p.length];
        for(int i=0;i<p.length;i++){
            list.add(p[i]);
        }
        for(int i = 1; i <= p.length; i++){
           a[i-1]=(list.indexOf(list.indexOf(i)+1)+1);
        }
        return a;
    }

}
