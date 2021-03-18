import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long sum=0,min=0,max=0;
        long a = 0;
        for(int i=0;i<5;i++){
            a = in.nextLong();
            sum+=a;
            if(i==0){
                min=a;max=a;
            }else {
                if(min>a)min=a;
                if(max<a)max=a;
            }
        }
        
       System.out.println((sum-max)+" "+(sum-min)); 
    }
}
