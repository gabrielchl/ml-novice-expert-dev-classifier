import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    static int pos(int[] p,int i) {
        int pos=0;
        for(int j=0;j<p.length;j++) {
           if(p[j]==i) {
                pos=j;
                break;
            }
        }
        return pos+1;
    }

    static int[] permutationEquation(int[] p) {
        int pos=0;
        int y[]=new int[p.length];
        for(int i=1;i<=p.length;i++) {
            int pos1=pos(p,i);
            int pos2=pos(p,pos1);
            y[i-1]=pos2;
        }
        return y;

    }

}
