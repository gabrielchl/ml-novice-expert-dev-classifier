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
    List<Integer> result=new ArrayList<Integer>();
    for(final int grade:grades){
        if(grade>=38){
            int num=grade/5;
            int round=(num+1)*5;
            if((round-grade)<3){
                result.add(round);
            }else{
            result.add(grade);
        }

        }
        else{
            result.add(grade);
        }
    }return result;

    }

}
