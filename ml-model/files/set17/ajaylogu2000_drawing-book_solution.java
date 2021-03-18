import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    static int solve(int n, int p) {
       int  a1=p/2;
       int  a2=n/2-p/2;
        return Math.min(a1,a2);

    }

}
