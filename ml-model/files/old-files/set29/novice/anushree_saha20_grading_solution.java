import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    static int[] solve(int[] grades) {

        for(int i=0; i<grades.length; i++)
        {
            if(grades[i]>37)
            {
                if((grades[i])%5 > 2)
                {
                    int n = 5 - (grades[i])%5;
                    grades[i] += n;
                }
            }
        }
        return grades;
    }

}
