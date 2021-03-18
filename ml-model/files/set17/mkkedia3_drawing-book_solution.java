import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    static int solve(int n, int p) {
         int ans=0;
         if(p<=n/2)
         {
             ans=p/2;
         }
         else if(n%2==0)
         {
             ans=n/2-p/2;
         }
         else
         {
             ans=n/2-p/2;
         }
         return ans;

    }

}
