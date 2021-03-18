import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int solve(int n, int m, int s) {
        return ((s - 1) + (m - 1)) %n + 1;
    }

}
