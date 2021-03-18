import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int solve(int n, int p){

        int total = 0;
        if(p > n/2) {
            for(int i=n; i>p; i--) {
            if(i%2==0) {
              total++;
            }

            if(i==p) {
                break;
            }
          }
        }else{
          for(int i=0; i<p; i++) {
            if(i%2!=0) {
              total++;
            }

            if(i==p) {
                break;
            }
          }
        }

        return total;
    }

}
