import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {
        int[] result=new int[p.length];
        for(int i=1;i<=p.length;i++){
            for(int j=1;j<=p.length;j++){
                if(p[j-1]==i){
                    for(int k=1;k<=p.length;k++){
                        if(p[k-1]==j){
                            result[i-1]=k;
                            break;
                        }

                    }
                    break;
                }
            }
        }
        return result;
    }

}
