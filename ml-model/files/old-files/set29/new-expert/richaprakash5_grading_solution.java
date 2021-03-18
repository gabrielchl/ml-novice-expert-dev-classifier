import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    static int[] solve(int[] grades) {
        int[] result = new int[grades.length];
        for(int i=0;i<grades.length;i++){
            if(grades[i]<38)
                result[i]=grades[i];
            else {
                for(int j=7;j<20;j++){
                   if((j*5)<=grades[i] && ((j+1)*5)>=grades[i]){
                       if(((j+1)*5)-grades[i]>=3)
                           result[i]=grades[i];
                    else
                        result[i]=((j+1)*5);
                   }
                }
            }
        }
  return result;
    }

}
