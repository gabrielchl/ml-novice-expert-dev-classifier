import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static String solve(int x1, int v1, int x2, int v2) {

        int numtr = x2-x1;
        int dentr = v1-v2;
        if(numtr >=0 && dentr >0){
            if(numtr/dentr >0 && numtr%dentr==0){
                return "YES";
            }else
                return "NO";
        }else
            return "NO";


    }

}
