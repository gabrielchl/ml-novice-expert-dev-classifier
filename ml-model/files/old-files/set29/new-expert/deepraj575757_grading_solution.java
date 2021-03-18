import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    static int[] solve(int[] grades) {
        int[] roundUpGrades = new int[grades.length];
        int roundedUpIndex = 0;
        for(int gradeIndex = 0 ; gradeIndex < grades.length ; gradeIndex ++){
            int grade = grades[gradeIndex];

            if(grade < 38){
                roundUpGrades[roundedUpIndex ++] = grade;
            }else{
                int difference = 0;
                int tempGrade = grade;
                while(tempGrade % 5 != 0){
                    difference ++;
                    tempGrade ++;
                }
                System.out.println("difference"+difference);
                if(difference < 3){
                    grade = grade + difference;
                }
                roundUpGrades[roundedUpIndex ++] = grade;
            }
        }
        return roundUpGrades;
    }

}
