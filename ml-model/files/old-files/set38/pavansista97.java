import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {
            int[] result = new int[p.length];
            int count=0;
            for(int i=0;i<p.length;i++){
                int x=i+1;
                for(int j=0;j<p.length;j++){
                    int z=0;
                    if(p[j]==x){
                        z=j+1;
                    }
                    for(int k=0;k<p.length;k++){
                        if(p[k]==z){
                            result[count]=k+1;
                            count++;
                        }
                    }
                }
            }
        return result;
    }

}
