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
