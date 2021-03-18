import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    static int[] solve(int[] grades) {
         for(int i=0;i<grades.length;i++){
               if(grades[i]>37){
                   int a=grades[i]%5;

                   if(a>2){
                       grades[i]=grades[i]-a+5;
                   }
               }

         }
       return grades;
    }

}
