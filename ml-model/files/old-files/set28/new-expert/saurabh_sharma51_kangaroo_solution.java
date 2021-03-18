import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static String solve(int x1, int v1, int x2, int v2) {
  if(v2>=v1 && x1!=x2){

       return "NO";

   }
   else{

       float x = (float)(x2-x1)/(v1-v2);

       if( Math.floor(x) == x )
           return "YES";
       else
           return "NO";
   }

    }

}
