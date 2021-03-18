import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) { // 2 3 1
        int arrSize = p.length;
        int[] retArr = new int[arrSize];
        int[] temp = new int[arrSize];
        int x = 1, xIdx = -1, xIdxAt = -1, a = 0;
        while(a < arrSize) {
            for(int i = 0; i < arrSize; i++) {
                if(x == p[i]) {
                    x++;
                    xIdx = i+1;
                    break;
                }
            }
            for(int i = 0; i < arrSize; i++) {
                if(xIdx == p[i]) {
                    xIdxAt = i;
                    break;
                }
            }
            temp[a] = ++xIdxAt;
            a++;
        }
        return temp;
    }

}
