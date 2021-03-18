import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the saveThePrisoner function below.
    static int saveThePrisoner(int n, int m, int s) {
        int prisoners=n;
        int start=s;
        int totalSweets=m;
        int extraSweets=totalSweets%prisoners;
        int result= start+extraSweets-1;
        return result;

    }

}
