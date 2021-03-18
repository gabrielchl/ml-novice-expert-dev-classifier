import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int getIndex(int[] p, int seq) {
        for(int i = 0; i < p.length; ++i) {
            if(p[i] == seq)
                return i;
        }
        return -1;
    }

    static int[] permutationEquation(int[] p) {
        int[] result = new int[p.length];
        int index;
        for(int seq = 1; seq <= p.length; ++seq) {
            // find where seq location in p
            index = getIndex(p, seq);
            // now get where that index is
            index = getIndex(p, index + 1);
            result[seq - 1] = index + 1;
        }
        return result;
    }

}
