import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    public static List<Integer> solve(List<Integer> grades) {
        List<Integer> result =new ArrayList<Integer>();
        for(Integer i : grades){
            if(i>=38 && i%5>=3){
             result.add(((i/5)*5)+5);
            }else{
              result.add(i);
            }
        }
         return result;
    }

}
