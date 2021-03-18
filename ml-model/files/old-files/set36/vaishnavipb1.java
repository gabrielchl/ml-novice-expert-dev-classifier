import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {
        int ln=p.length;
       int[]res=new int[ln];
        for(int i=0;i<ln;i++){
            int index=p[p[p[i]]];
           // System.out.println("when i is "+i+" index i.e. x is "+index);
            res[index]=p[i];
            //System.out.println("x= "+index+" and y = "+p[i]);
        }
    return res;}

}
