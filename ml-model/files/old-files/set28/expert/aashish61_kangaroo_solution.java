import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static String solve(int x1, int v1, int x2, int v2) {

        if(x1 == x2 && v1 == v2){
            return "YES";
        }
       else if(x1 == x2 && v1>v2){
            return "NO";
        }
        else if(x2>=x1 && v2 >= v1){
            return "NO";
        }else{
            if((x2-x1)%(v2-v1) == 0){
                return "YES";
            }else{
                return "NO";
            }
        }

    }

}
