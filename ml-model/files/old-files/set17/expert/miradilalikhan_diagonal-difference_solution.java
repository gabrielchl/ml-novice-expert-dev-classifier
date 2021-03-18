import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    public static int solve(List<List<Integer>> arr) {
        Integer d1 =0,d2=0;
    for(int i=0; i<arr.size(); i++){
        d1+=arr.get(i).get(i);
        d2+=arr.get(arr.size()-i-1).get(i);
    }
    Integer result = d1-d2;
    if(result<0) result = -1*result;
    return result;

    }

}
