import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

  static int[] solve(int[] grades){
        for(int i=0;i<grades.length;i++)
        {
          if(grades[i]>=38)
          {
               if(grades[i]+(5-grades[i]%5)-grades[i]<3)
               grades[i]=(grades[i]+(5-grades[i]%5));
          }
        }
        return grades;
    }

}
