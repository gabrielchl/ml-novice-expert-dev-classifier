import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    public static int solve(List<List<Integer>> arr) {
    int d1 = 0;
    int d2 = 0;
    for(int i = 0;i<arr.size();i++){
        d1 = d1 + arr.get(i).get(i);
    //    System.out.println(d1);
        d2 = d2 + arr.get(i).get(arr.size()-i-1);
   //     System.out.println(d2);
    }
    if(0<=d2-d1){
        return d2-d1;
    }
    else{
        return d1-d2;
    }

    }

}
