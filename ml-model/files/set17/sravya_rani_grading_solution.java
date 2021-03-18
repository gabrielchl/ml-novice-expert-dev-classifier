import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    static int[] solve(int[] grades) {
        int len=grades.length;
        int res[]=new int[len];
        for(int i=0;i<len;i++)
        {
            if(grades[i]>=38)
            {
                if(((grades[i]+(5-(grades[i]%5)))-grades[i])<3)
                {
                    res[i]=grades[i]+(5-(grades[i]%5));
                    //System.out.println(res[i]);
                }
                else
                    res[i]=grades[i];
            }
            else
                res[i]=grades[i];
        }
        return res;

    }

}
