import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    public static List<Integer> solve(List<Integer> grades) {
        for(int i=0;i<grades.size();i++)
        {
            if(grades.get(i)>37)
            {
                if((grades.get(i)+2)%5==0)
                {
                    grades.set(i,(grades.get(i)+2));
                }
                else if((grades.get(i)+1)%5==0)
                {
                    grades.set(i,(grades.get(i)+1));
                }
            }
        }
        return grades;
    }

}
