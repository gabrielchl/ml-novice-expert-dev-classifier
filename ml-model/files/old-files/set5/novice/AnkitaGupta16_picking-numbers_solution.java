import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'pickingNumbers' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static int pickingNumbers(List<Integer> a) {
    Collections.sort(a);
    int maxCount=0;
    int tempCount;
    for(int i=0;i<a.size();i++)
    {
        tempCount=1;
        for(int j=i+1;j<a.size();j++)
        {
            if((Math.abs(a.get(i)-a.get(j))==0) || (Math.abs(a.get(i)-a.get(j))==1))
            tempCount++;
        }
        if(maxCount<tempCount)
        maxCount=tempCount;
    }
    return maxCount;
    }

}
