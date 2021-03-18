import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    static int[] solve(int[] grades) {
        int[] roundedGrades = new int[grades.length];
        for (int i = 0; i < grades.length; i++) {
            roundedGrades[i] = roundingGrades(grades[i]);
        }
        return roundedGrades;
    }

    private static int roundingGrades(int grade) {
        if (grade < 38) {
            return grade;
        }
//        System.out.println(String.format("%d", (grade % 5)));
//        System.out.println(String.format("%d %d %d", (grade / 5), (grade / 5) * 5, (((grade / 5) + 1) * 5)));
        if((grade % 5) > 2) {
            return (((grade / 5) + 1) * 5);
        }
        return grade;
    }

}
