import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {

        int temp,l=p.length;
        int[] a = new int[l];
        for(int i=0;i<l;i++){
            temp = p[i]-1;
            a[p[temp]-1]=i+1;
        }
        return a;

    }

}
