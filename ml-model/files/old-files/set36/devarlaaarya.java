import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {

        int p_inverse[] = new int[p.length];
        for(int i=0;i<p.length;i++)
            p_inverse[p[i] - 1] = i + 1;

        int result[] = new int[p.length];
        for(int i=0;i<p.length;i++)
            result[i] = p_inverse[p_inverse[i] - 1];

        return result;
    }

}
