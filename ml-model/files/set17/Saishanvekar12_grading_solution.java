import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int[] solve(int[] grades){

        for(int i=0;i < grades.length;i++)
        {
            if(grades[i]<38)
              continue;
               else  if(grades[i]%5>2)

                    grades[i] += 5 - (grades[i]%5);

                else
                    continue;
        }

         return grades;

}

}
