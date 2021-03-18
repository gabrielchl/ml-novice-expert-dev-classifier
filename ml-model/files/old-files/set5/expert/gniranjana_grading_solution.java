import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'gradingStudents' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY grades as parameter.
     */

    public static List<Integer> gradingStudents(List<Integer> grades) {
    // Write your code here
    if (grades == null || grades.size() ==0) return null;

        List<Integer> newGrades = new ArrayList<>();
        boolean isAdded=false;
        for(int grade : grades) {
            if (grade < 38) {
//                If the value of grade is less than 38, no rounding occurs as the result will still be a failing grade.
                newGrades.add(grade);
            }
            else {
                // If the difference between the  and the next multiple of 5 is less than 3, round grade up to the next multiple of 5.
                int fiveMul =0;
                if(grade % 10 < 5)
                {
                 fiveMul = ((grade/10)*10) + 5;
                }
                else if (grade %10 > 5) {
                    fiveMul = ((grade/10)*10) + 10;
                }
                if (Math.abs(grade-fiveMul) < 3) {
                    int diff = Math.abs(grade-fiveMul);
                    newGrades.add(grade += diff);
                    isAdded= true;
                }
                if(!isAdded) {
                    newGrades.add(grade);
                    isAdded=false;
                    }
                if(isAdded) isAdded=false;
            }
        }

        return newGrades;
    }

}
