import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static String solve(int x1, int v1, int x2, int v2) {

     for( int i=x1; i<10000000; i=i+v1 ){
      if(i==x2){
        return "YES";
            }
        x2=x2+v2;
        }
        return "NO";
    }

}
