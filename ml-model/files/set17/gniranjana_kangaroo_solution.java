import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static String solve(int x1, int v1, int x2, int v2) {
        if(Math.abs(v2-v1)== 0 ) return "NO";
        if( x2>x1 && v2>v1) return "NO";
        if (Math.abs((x1 - x2)) % (v2 - v1) == 0)
            return "YES";
        else
            return "NO";
        /*boolean canJump = false;
        if (x2>x1 && v2>v1){
            return "NO";
        }
        int sum1 = x1+v1;
        int sum2 = x2+v2;
        int jmp1 =1, jmp2 =1;
        while (sum1 != sum2){
            if (sum1 < sum2){
                jmp1 ++;
                sum1+= v1;
            }
            sum2 += v2;
            jmp2++;
            if (sum1== sum2 && jmp1 == jmp2)
            {
                canJump = true;
                break;
            }

        }

        /*do{
            if(sum == (x2+v2))
            {
                canJump = true;
                break;
            }
            else sum+= v1;
        }while(sum <= (x2+v2));

        if(canJump) return "YES";
        else return "NO";*/
    }


}
