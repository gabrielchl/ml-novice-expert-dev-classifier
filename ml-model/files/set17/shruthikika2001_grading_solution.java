import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    static int[] solve(int[] a)
    {
       for(int i=0;i<a.length;i++)
       {
          int g=a[i];
           if(g>=38)
           {
               if(((g/5)*5+5)-g<3)
               g=g/5*5+5;
           }
           a[i]=g;
       }
       return a;

    }

}
