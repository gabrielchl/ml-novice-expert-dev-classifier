import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static String solve(int x1, int v1, int x2, int v2) {
        boolean less_than = true;
                if(x1 > x2){
                    less_than = false;
                }
        if(x1 != x2){
            if(v1 == v2){
                return "NO";
            }else{

            }
            int jump = 1;
            while(true){
                int k1_loc = x1 + jump*v1;
                int k2_loc = x2 + jump*v2;
                jump++;

                if(k1_loc == k2_loc){
                    return "YES";
                }else{
                    if(k1_loc > k2_loc && less_than == true){
                        return "NO";
                    }else if(k1_loc < k2_loc && less_than == false){
                        return "NO";
                    }
                }
            }
        }

        return "YES";



    }

}
