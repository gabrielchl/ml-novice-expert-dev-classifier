import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {

        int len = p.length,x=0;
        int arr[] = new int[len];
        for(int i = 0; i< len; i++){
            int j=0;
            for(j = 0; j< len ; j++){
                if((i+1) == p[j])
                    break;
            }
            int z=0;
            for(z = 0 ; z< len ; z++){
                if(p[z]==(j+1))
                    break;
            }
            arr[x++] = z+1;
        }
        return arr;

    }

}
