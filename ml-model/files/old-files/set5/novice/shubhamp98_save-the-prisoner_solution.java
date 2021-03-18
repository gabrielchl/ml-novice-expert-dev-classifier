import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the saveThePrisoner function below.
    static int saveThePrisoner(int n, int m, int s) { // 7 19 2
       int a = s+m-1;   // 20
        if(a>n){
            if(a%n==0){
                return n;
            }
            return a%n;
        }

         return a;
    }
}
