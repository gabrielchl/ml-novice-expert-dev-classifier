import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    static int[] solve(int[] grades) {
        for(int index = 0; index < grades.length; index++){
            int remainder = (5-grades[index]%5);
            if((grades[index]+remainder) >= 40){

                if(remainder < 3){
                    grades[index] = grades[index] + remainder;

                }


            }
        }
        return grades;

    }

}
