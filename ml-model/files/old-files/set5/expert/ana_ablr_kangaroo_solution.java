import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the kangaroo function below.
    static String kangaroo(int x1, int v1, int x2, int v2) {

        if(v1>v2){
            int remainder = (x1 - x2)  % (v2 - v1);
             if(remainder == 0){
                 return "YES";
             }
        }
        return "NO";


    }

}
