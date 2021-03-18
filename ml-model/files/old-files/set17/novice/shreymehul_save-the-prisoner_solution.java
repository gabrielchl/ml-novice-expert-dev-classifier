import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int saveThePrisoner(int n, int m, int s) {
        int a;
        a= m%n;
        if(a==0){
            a=n;
        }
        a=a+s-1;
        if(a>n){
            a=a-n;
        }
        // int i=s;
        // while(true){
        //     m--;
        //     if(m==0){
        //         break;
        //     }
        //     i++;
        //     if(i>n){
        //         i=1;
        //     }
        // }
        return a;


    }

}
