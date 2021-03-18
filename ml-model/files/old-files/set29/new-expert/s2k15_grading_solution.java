import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    static int[] solve(int[] grades) {
         int[] outGrades = new int[grades.length];
         for(int i=0;i<grades.length;i++)
         {
             if(grades[i]<38)
             {
                 outGrades[i]=grades[i];
             }
             else
             {
                 if(grades[i]%5>2)
                 {
                     outGrades[i]=((grades[i]/5)*5)+5;
                 }
                 else
                 {
                     outGrades[i]=grades[i];
                 }
             }
         }
         return outGrades;

    }

}
