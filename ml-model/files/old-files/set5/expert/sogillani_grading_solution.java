import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the gradingStudents function below.
     */
    static int[] gradingStudents(int[] grades) {

        for (int i = 0; i < grades.length; i++) {

            if (grades[i] < 38)
                continue;

            int nextFiveMultiple = (((grades[i] / 5) ) + 1) * 5;

            int diff = nextFiveMultiple - grades[i];
            if ( diff < 3)
                grades[i] = nextFiveMultiple;

        }

        return grades;
    }
}
