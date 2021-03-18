import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static String solve(int x1, int v1, int x2, int v2) {
          boolean f=true;
          int d=x1;
          int d2=x2;
          String s="";
          while(f=true)
          {
           d=d+v1;
           d2=d2+v2;
              if(d==d2)
              {
                  s="YES";

                  f=false;
                  break;
              }
              else if (d>d2 && d-d2>v2)
              {
                 s="NO";

                  f=false;
                  break;
              }
               else if (d<d2 && d2-d>v1)
              {
                 s="NO";

                  f=false;
                  break;
              }

          }
          return s;
          }



}
