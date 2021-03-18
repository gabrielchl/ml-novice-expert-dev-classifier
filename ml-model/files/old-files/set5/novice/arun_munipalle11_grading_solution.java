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
        List<Integer> newG = new ArrayList<>();
        for(int i=0;i<grades.size();i++)
        {
            int num = grades.get(i);
            int val = ((num/5)+1)*5;
            if(num>=38)
            {
                if((val - num)<3)
                    newG.add(i,val);
                else
                    newG.add(i,num);
            }
            else
                newG.add(i,num);
            //System.out.println(newG.get(i));
        }
        return newG;
    }

}
