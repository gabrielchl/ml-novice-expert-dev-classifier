import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    static int[] solve(int[] grades) {
       int[] res = new int[grades.length];
            for (int i = 0; i < grades.length; i++)
            {
                if (grades[i] % 5 > 2 && !(grades[i] < 38))
                    res[i] = grades[i] + (5-grades[i]%5);
                else
                    res[i] = grades[i];

            }
            return res;

    }

}
