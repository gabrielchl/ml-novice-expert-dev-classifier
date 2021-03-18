import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    public static int solve(List<List<Integer>> arr) {

        int diag1 = 0, diag2 = 0;

        for (int i = 0; i < arr.size(); i++){

            for(int j = 0; j < arr.size(); j++){
                // finding sum of primary diagonal
                if (i == j)
                    diag1 += arr.get(i).get(j);

                // finding sum of secondary diagonal 
                if (i == (arr.size() - j - 1))
                    diag2 += arr.get(i).get(j);

            }

        }

        // Absolute difference of the sums
        // across the diagonals
        return Math.abs(diag1 - diag2);
    }

}
