/*import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution
{
    public static void main(String s[])
    {
        int index=0,temp;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<i;j++)
            {
            if(a[i]>a[j])
            {
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
            }
        }
        
        
              for(int i=0;i<n-1;i++)
              {    
               if(a[i]==a[i+1])
               {
                index=i; 
               }
                  if(a[index]==a[index+1])
                  {
                       System.out.println(""+a[i]);
                      break;
                  }
              }
         
            
    }
    } */



import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    static int migratoryBirds(int n, int[] ar){
                
        int ans[] = new int[5];
        
        for(int i = 0;i<n;i++){
            (ans[(ar[i])-1])++;
        }
        
        int retval=-1, max = 0;
        for(int i = 0;i<5;i++){
           // System.out.println(ans[i]);
            if(ans[i]>max){
                max = ans[i];
                retval = i+1;
            }
                
        }
      return retval; 
        
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ar[] = new int[n];
        if(n>=5 && n<=(200000)){
            for(int i = 0;i<n;i++){
                ar[i] = sc.nextInt();
            }
            int result = migratoryBirds(n,ar);
            System.out.println(result);
        }
    }
}









