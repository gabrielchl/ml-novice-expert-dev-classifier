import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {
        int a[]=new int[100];
        int b[]=new int[p.length];
        int k=0;
        for(int i=0;i<p.length;i++)
        a[p[i]]=i+1;
        Arrays.sort(p);
        for(int i=0;i<p.length;i++)
        b[k++]=a[a[p[i]]];
        return b;
    }

}
