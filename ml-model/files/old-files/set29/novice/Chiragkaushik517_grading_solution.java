import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    static int[] solve(int[] grades) {
        int r,d,i=0;
        for(int a:grades)
        {
            if(a>=35)
            {
                 r=a%5;
                if(r>=3)
                {
                 d=a/5;
                    grades[i]=(d+1)*5;
                }
            }
            i++;
        }
        return grades;

    }

}
