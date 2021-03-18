import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    static int[] solve(int[] grades) {
        int i,d;
        int l=grades.length;
        for(i=0;i<l;i++)
        {
            if(grades[i]>=38)
            {
                if((grades[i]%5)>2)
                    grades[i]=5*((grades[i]/5)+1);
            }
        }
        return grades;
    }

}
