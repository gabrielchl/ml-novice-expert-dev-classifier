import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static String kangaroo(int x1, int v1, int x2, int v2) {
  if ((x2 > x1 && v2 > v1) || (x2 < x1 && v2 < v1)) {
            return "NO";
        }
        for(int i = 0; i < 10000; i++){
//            if(x1 > x2){
//                x2 += v2;
//            }
//            if(x1 == x2){
//                return "YES";
//            }
//            if(x2 > x1){
//                x1 += v1;
//            }
//            if(x1 == x2){
//                return "YES";
//            }
            x1+=v1;
            x2+=v2;
            if(x1==x2){
                return "YES";
            }
        }

        return "NO";

    }

}
