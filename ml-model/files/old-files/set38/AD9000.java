import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permute(int p[])
    {
        int y[] = new int[p.length];
        for (int i = 0; i < p.length; i++)
        {
            y[p[i] - 1] = i + 1;
        }
        return y;
    }

    static int[] permutationEquation(int[] p) {
        p = permute(p);
        int y[] = new int[p.length];
        for (int i = 0; i < p.length; i++)
        {
            y[i] = p[p[i] - 1];
        }
        return y;
    }

}
