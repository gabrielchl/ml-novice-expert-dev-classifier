import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int solve(int n, int m, int s) {

        return ((m+s-1)%n==0)?n:(m+s-1)%n;

    }

}
