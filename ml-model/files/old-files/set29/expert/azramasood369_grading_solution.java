import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    static int[] solve(int[] grades) {
        //declare array to return
        int[] res_arr = new int[grades.length];
        int curr_index = 0;
        //for each array element
        for (int grade:grades){
            if (grade < 38)
            {
                res_arr[curr_index] = grade;
            }
            else
            {
                int next_multiple_of_five = (grade+5)-(grade%5);
                int diff = next_multiple_of_five - grade;
                int final_grade = (diff < 3) ? next_multiple_of_five: grade;
                res_arr[curr_index] = final_grade;
            }
            curr_index++;
        }
    return res_arr;
    }

}
