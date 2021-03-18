import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t =sc.nextInt();
        for(int i=0;i<t;i++)
            {
            int r=0;
            int n=sc.nextInt();
            int m=sc.nextInt();
            int s=sc.nextInt();
          
                r=n-s+1;
            if(m<=r){
                m=s+m-1;
                System.out.println(m);
            }
            else if(m>r)
                {
                m=m-r;
                if(m%n==0)
                	System.out.println(n);
                else
                 System.out.println(m%n);
            }
        }
    }
}