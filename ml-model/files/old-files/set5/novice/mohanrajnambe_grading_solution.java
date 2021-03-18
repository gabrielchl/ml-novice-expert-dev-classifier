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
        List<Integer> res = new ArrayList<>();
        for(int i=0;i<grades.size();i++){
            int n=grades.get(i);
            if(n<38){
                res.add(n);
                continue;
            }
            int diff=5-(n%5);
            if(diff==1 || diff==2){
                res.add(n+diff);
            }else{
                res.add(n);
            }
        }
        return res;

    }

}
