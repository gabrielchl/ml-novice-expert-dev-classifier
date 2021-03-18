import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'gradingStudents' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY grades as parameter.
     */

    public static List<Integer> gradingStudents(List<Integer> grades) {
    // Write your code here
    int r; int t;
        for(int i=0;i<grades.size();i++)
        {
            if(grades.get(i)>37)
            {
                r=grades.get(i)%5;
                if(r>2)
                {
                   t=grades.get(i);
                    grades.set(i,t+5-r);
                }
            }
        }
        return grades;
    }

}
