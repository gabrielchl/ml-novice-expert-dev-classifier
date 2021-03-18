import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the pageCount function below.
     */
    static int pageCount(int n, int p) {
        int total = n / 2;
        int fromFront = p / 2;
        int fromBack = total - fromFront;
        return Math.min(fromFront, fromBack);
    }
}
