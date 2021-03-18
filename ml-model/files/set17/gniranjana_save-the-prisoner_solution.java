import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int solve(int n, int m, int s) {
          static int saveThePrisoner(int n, int m, int s) {
        int prisonerNum = 0, startPos = s;
        while (m > 0){
            if (startPos == n) startPos = 1;
            else startPos++;
            m--;
            if(m==1) {
                prisonerNum = startPos;
                break;
            }
        }
        return prisonerNum;
    }
    }

}
