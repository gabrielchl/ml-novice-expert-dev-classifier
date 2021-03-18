import java.util.*;
import java.lang.*;
class Solution
{
     public static void main(String args[])
     {
         Scanner s=new Scanner(System.in);
         int a[]=new int[8];
         int n=s.nextInt();
         for(int i=0;i<n;i++)
         {
             a[i]=s.nextInt();
         }
         List<Integer>l=new ArrayList();
         for(int i=0;i<n;i++)
         {
             int count=0;
             int count2=0;
             for(int j=i+1;j<6;j++)
             {
             int a1=a[i];
             int a2=a[j];
             if((Math.abs(a1-a2)==0)||(Math.abs(a1-a2)==1))
             {
                 count=count+1;
                 //System.out.print(j);
                 //flag=1;
             }
            l.add(count);
 
            }
          // System.out.print(count+" "+count2);
         }
        System.out.print(Collections.max(l));
     }
}
