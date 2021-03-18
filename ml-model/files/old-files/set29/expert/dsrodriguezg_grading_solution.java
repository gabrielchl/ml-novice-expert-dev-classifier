import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int[] solve(int[] grades){

        int respaldo = 0;

        for(int i =0 ;i<grades.length;i++){

           if(grades[i]>= 38){

               respaldo = grades[i];

               while((grades[i] % 5) != 0){

                   grades[i]++;
               }

               if((grades[i] - respaldo) >= 3) {

                   grades[i] =  respaldo;
               }
           }

        }

        return grades;

    }

}
