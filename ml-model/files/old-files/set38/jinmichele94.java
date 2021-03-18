import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {
       int size = p.length;
       int[] result = new int[size];
       for(int i=0; i<size;i++){
         for(int j=0; j<size;j++){
           if(p[p[j]-1]==i+1){
             result[i] = j+1;
             break;
           }
         }
       }
       return result;
    }

}
