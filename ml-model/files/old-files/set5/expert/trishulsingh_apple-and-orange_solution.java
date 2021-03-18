import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the countApplesAndOranges function below.
    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {

        int totalApples=0,totalOrages=0;
    for(int m=0;m<apples.length;m++){
        apples[m]=apples[m]+a;
        if(apples[m]>=s && apples[m]<=t){
            totalApples++;
        }
    }
    for(int n=0;n<oranges.length;n++){
        oranges[n]=oranges[n]+b;
        if(oranges[n]>=s && oranges[n]<=t){
            totalOrages++;
        }
    }
    System.out.println(totalApples);
    System.out.println(totalOrages);



    }

}
