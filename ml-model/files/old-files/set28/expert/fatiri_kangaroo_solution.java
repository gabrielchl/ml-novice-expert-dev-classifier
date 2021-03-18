import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static String solve(int x1, int v1, int x2, int v2) {

    String output ="NO";
    while(x1<=x2){
        if(x1==x2){
          output = "YES";
          break;
        }
        x1 += v1;
        x2 += v2;
    }

    return output;

    }

}
