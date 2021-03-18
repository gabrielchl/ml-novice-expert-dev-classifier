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
        List<Integer> fin = new ArrayList<Integer>();

        for (int i = 0; i < grades.size(); i++)
        {
            int temp = grades.get(i);

            if(temp < 38)
            {
                fin.add(temp);
            }
            else
            {
                int near = 5 + 5*((int)Math.ceil(Math.abs(temp/5)));
                if((near - temp) < 3)
                {
                    fin.add(near);
                }
                else
                {
                    fin.add(temp);
                }
            }
        }
        return fin;
    }

}
