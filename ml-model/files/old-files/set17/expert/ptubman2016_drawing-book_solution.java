import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    static int solve(int n, int p) {
        int numTurns;
        if(p > n/2){

            if(n % 2 == 0){
            numTurns = ((n - p) +1) / 2;
            }else{
                numTurns = (n - p)/ 2;
            }
        }
        else{
            numTurns = p / 2;
        }

        return numTurns;

    }

}
