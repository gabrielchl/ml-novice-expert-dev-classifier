import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    static int solve(int n, int p) {
        int total = n / 2;
        int fromFront = p / 2;
        int fromBack = total - fromFront;
        return Math.min(fromFront, fromBack);
    }

}
