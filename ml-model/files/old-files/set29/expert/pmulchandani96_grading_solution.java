import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    static int[] solve(int[] grades) {

        int[] roundedGrades = new int[grades.length];
        for(int i = 0;i < grades.length ;i++){
            if(grades[i]< 38){
              roundedGrades[i] = grades[i];
            }else if(grades[i] % 5 == 0){
              roundedGrades[i] = grades[i];
            }else{
               int nextMultiple = getNextMultipleOfFive(grades[i]);
               int difference = nextMultiple - grades[i];
               if(difference < 3){
                roundedGrades[i] = nextMultiple;
               }else{
                 roundedGrades[i] = grades[i];
               }
            }
        }
     return roundedGrades;
    }

    static int getNextMultipleOfFive(int number){
       while(number % 5!=0){ ++number; }
        return number;
    }

}
