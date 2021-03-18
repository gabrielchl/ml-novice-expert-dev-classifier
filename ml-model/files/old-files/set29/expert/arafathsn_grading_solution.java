import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    static int[] solve(int[] grades) {
        int i = 0;
        for (int grade : grades) {
            if (grade < 38 || grade/5 == 0) {
                i++;
                continue;
            }

            int gradeMult = grade/5;
            int nextGrade = (gradeMult+1) * 5;

            if (nextGrade - grade  < 3)
                grades[i] = nextGrade;

            i++;
        }

        return grades;
    }

}
