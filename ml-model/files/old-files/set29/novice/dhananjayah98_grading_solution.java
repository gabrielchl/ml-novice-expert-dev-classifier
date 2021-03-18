import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    static int[] solve(int[] grades) {
       for(int i=0;i<grades.length;i++)
       {
           if(grades[i]>=38)
           {
               int s1=(grades[i]/5)+1;
               int s2=(s1*5)-grades[i];
               if(s2<3)
               {
                   grades[i]+=s2;
               }
           }
       }
return grades;
    }

}
