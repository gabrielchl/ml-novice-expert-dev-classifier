import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {
        int[] result = new int[p.length];
        for(int i = 1; i <= p.length; i++) {
            int index = 0;
            for(int j = 0; j < p.length; j++) {
                if(p[j] == i) {
                    index = j + 1;
                    break;
                }
            }
            for(int j = 0; j < p.length; j++) {
                if(p[j] == index) {
                    index = j + 1;
                    break;
                }
            }
            result[i - 1 ] = index;
        }
        return result;
    }

}
