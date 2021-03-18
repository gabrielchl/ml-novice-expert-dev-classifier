import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {




    private static String solve(int x1, int v1, int x2, int v2) {

        int sum1=0,sum2=0;
        int count=1;

        while(count!=0)
        {
            sum1=x1+v1;
            x1=sum1;

            sum2=x2+v2;
            x2=sum2;
            if(sum1==sum2)
            {
                count=0;
                break;
            }
            else{
                if(sum2>=100000000){
                    break;
                }
            }
        }

        if(sum1==sum2)
        {
        System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
