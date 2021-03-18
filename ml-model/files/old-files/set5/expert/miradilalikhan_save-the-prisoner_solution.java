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
            return ((s+m-1)%n==0)?n:(s+m-1)%n;
    }
}
