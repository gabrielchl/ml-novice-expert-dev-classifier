import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int saveThePrisoner(int n, int m, int s) {
        //n-prisinors , m-sweets , s-start
        /*long r=(long)(m+s-1)%n;
        while(r>(long)n){
            r-=(long)n;
        }
        return (int)r;*/
        if((m+s-1)%n==0)
            return n;
        else
            return (m+s-1)%n;

    }

}
