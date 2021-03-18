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
          int x=x1-x2;
    int v=v2-v1;
    if(v!=0){
        if(x%v==0 && x/v>0){
            return "YES";
        }else {return "NO";}

    }else {return "NO";}

    }

}
