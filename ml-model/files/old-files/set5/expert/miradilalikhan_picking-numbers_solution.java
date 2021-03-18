import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'pickingNumbers' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static int pickingNumbers(List<Integer> a) {
        Collections.sort(a);
        int highest=0;
        for(int i=0; i<a.size(); i++){
            int current=0;
            for(int j=i; j<a.size(); j++){
                if(Math.abs(a.get(i)-a.get(j))<=1) current++;
            }
            if(highest<current)highest=current;
        }
    return  highest;
    }

}
