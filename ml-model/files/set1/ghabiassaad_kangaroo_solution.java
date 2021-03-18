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
        if(v1==v2){
            if(x1==x2){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }else{
            float value=(float)(x1-x2)/(float)(v1-v2);
            if ((value == Math.round(value))&& (value<0)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
