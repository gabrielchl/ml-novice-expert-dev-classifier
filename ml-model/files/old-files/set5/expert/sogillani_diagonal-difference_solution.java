import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the diagonalDifference function below.
    static int diagonalDifference(int[][] arr) {
        int rightToLeftSum = 0;
        int leftToRightSum = 0;

        for (int i = 0, j = arr.length - 1; i < arr.length; i++, j--) {
            rightToLeftSum += arr[i][i];
            leftToRightSum += arr[i][j];
        }

        int dignalDifference = rightToLeftSum - leftToRightSum;

        return Math.abs(dignalDifference);
    }

}
