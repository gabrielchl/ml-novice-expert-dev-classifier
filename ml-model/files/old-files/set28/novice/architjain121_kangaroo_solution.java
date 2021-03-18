import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static String solve(int x1, int v1, int x2, int v2) {
        float m;
        String s = "NO";

        if((v2-v1) != 0){
            if((x1-x2)%(v2-v1) == 0 && ((x1-x2)/(v2-v1))>0){
            s="YES";
        }
        else
            s = "NO";

        }

        return s;
    }

}
