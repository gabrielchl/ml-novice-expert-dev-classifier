import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        int a=0,b=0,c=0;
        a=x1;
        b=x2;
        if(x1>=0 && x1<x2){
            if(v1>=1 && v2>=1){
       while((a!=100000)&&(b!=100000)){
           if(a==b){
               System.out.println("YES");
               c++;
               break;
           }
           a=a+v1;
           b=b+v2;
       }
           if(c==0){
               System.out.println("NO");
           }
           }
       }      
    }
    
}
