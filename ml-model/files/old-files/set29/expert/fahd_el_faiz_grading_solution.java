import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    static int[] solve(int[] grades) {
        int[] aa = new int[grades.length];
          String s="";
          int a = 0;
          char t;
           int ajou=0;
        for(int i=0;i<grades.length;i++){


            if(grades[i]>=38){


               s=Integer.toString(grades[i]);
               t=s.charAt(1);

               a=Integer.parseInt(String.valueOf(t));

               if(a>0 && a<=5 && 5-a<3){
                   ajou=5-a;

                   aa[i]=grades[i]+ajou;
               }
               else if(a>5 && a<=10 && 10-a<3){
                   ajou=10-a;

                   aa[i]=grades[i]+ajou;
               }
               else{
               aa[i]=grades[i];
               }
            }
              if(grades[i]<38){

               aa[i]=grades[i];
            }
        }

        return aa;
    }



}
