import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    public static List<Integer> solve(List<Integer> grades) {
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
