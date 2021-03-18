import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int solve(int n, int p){
        // Complete this function
        
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

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = in.nextInt();
        int result = solve(n, p);
        System.out.println(result);
    }
}
