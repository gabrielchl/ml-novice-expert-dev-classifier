import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static String solve(int x1, int v1, int x2, int v2) {
        long sum1=x1,sum2=x2;
        for(int i=0;i<Integer.MAX_VALUE;i++){
          sum1=sum1+v1;
          sum2=sum2+v2;
          if(sum1==sum2)
            return "YES";
        }
      return "NO";

    }

}
