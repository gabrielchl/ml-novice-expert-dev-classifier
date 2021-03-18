import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    static int[] solve(int[] grades) {
        int num=0;
        int sum=0;
        int mul=0;

        for(int i=0;i<grades.length;i++)
        {        if(grades[i]>37)
            {
                mul=grades[i]/5;
                num=(mul+1)*5;
                sum=num-grades[i];

                if(sum<3)
                {
                    grades[i]=num;
                }
            }
        }
return grades;
    }

}
