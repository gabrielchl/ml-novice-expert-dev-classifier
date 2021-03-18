import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    private static String solve(int x1,int v1,int x2, int v2){
        if(v1>v2){
        while(x1<x2 && x2!=10001){
            x1=x1+v1;
            x2=x2+v2;
            if(x1==x2)break;
        }

        }

        if(x1==x2)System.out.println("YES");
        else System.out.println("NO");
    }
}
