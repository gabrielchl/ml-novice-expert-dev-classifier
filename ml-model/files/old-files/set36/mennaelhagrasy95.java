import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {
        int[] answer = new int[p.length];
   for (int i =1;i<=p.length;i++){
           for(int j =0;j<p.length;j++){
               if(p[j]==i){
                  for(int x =0;x<p.length;x++){
                      if(p[x]==j+1)answer[i-1]=x+1 ;
                  }
               }
           }
       } return answer;

    }

}
