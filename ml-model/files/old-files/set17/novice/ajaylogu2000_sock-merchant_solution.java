import java.util.*;
class Solution
{
 static int solve(int n, int[] a)
 {
     Set<Integer>c=new HashSet<>();
     int count=0;
     for(int j=0;j<n;j++)
     {
         if(!c.contains(a[j]))
          c.add(a[j]);
     else
     {
         count=count+1;
         c.remove(a[j]);
     }
     }
     return count;
   }
}
