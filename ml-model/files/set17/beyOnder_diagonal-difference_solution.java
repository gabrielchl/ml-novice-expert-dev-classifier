import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int solve(int[][] arr) {
        int a=0,b=0;
        for (int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(i==j){
                    a+=arr[i][j];
                }
                if(i+j==(arr.length-1)){
                    b+=arr[i][j];
                }
            }


        }
        int diff=a-b;
        if(diff<0){
                diff=diff*(-1);
            }

        return diff;
    }

}
