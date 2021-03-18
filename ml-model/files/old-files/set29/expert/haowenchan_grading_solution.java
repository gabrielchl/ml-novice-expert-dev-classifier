import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    static int[] solve(int[] grades) {
        for (int i = 0; i < grades.length; i++) {
            int g = grades[i];
            if ((g >= 38) && (g % 5 >= 3)) {
                g = (g/5 + 1) * 5;
            }
            grades[i] = g;
        }

        return grades;
    }

}
