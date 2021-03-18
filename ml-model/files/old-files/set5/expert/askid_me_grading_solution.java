import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'gradingStudents' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY grades as parameter.
     */

    public static List<Integer> gradingStudents(List<Integer> grades) {
    // Write your code here
        List<Integer> modifiedGrades = grades.stream().map(grade -> {
            if (grade < 38) return grade;
            if ((grade + 1) % 5 == 0) return grade + 1;
            if ((grade + 2) % 5 == 0) return grade + 2;
            return grade;
        }).collect(Collectors.toList());
        return modifiedGrades;

    }

}
