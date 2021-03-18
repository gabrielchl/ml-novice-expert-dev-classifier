import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the kangaroo function below.
    public static void main(String args[]){
        int x1,v1,x2,v2;
        Scanner s=new Scanner(System.in);
        x1=s.nextInt();
        v1=s.nextInt();
        x2=s.nextInt();
        v2=s.nextInt();
            if(v2>v1){
                System.out.println("NO");
            }
           else if(v1==v2){
               System.out.println("NO");
           } 
            else {
                while(x1!=x2){
                    x1+=v1;
                    x2+=v2;
                }
                if(x1==x2 || x1>x2){
                    System.out.println("YES");
                }
                else {
                    System.out.println("NO");
                }
            }
    }
}
