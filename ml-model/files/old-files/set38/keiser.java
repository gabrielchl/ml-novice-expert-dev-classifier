
/* Problem Solving --- Sequence Equation */
import java.io.*;
import java.util.*;

class Solution {

    static int[] permutationEquation(int[] p) {
        int[] art = new int[p.length];
        int counter = 0;

        for (int i = 0; i < p.length; i++) {
            int blank = i + 1;

            int position = solve(blank, p);
            int ans = solve(position, p);
            art[counter] = ans;
            counter++;
        }

        return art;
    }

    static int solve(int num, int[] p) {
        for (int i = 0; i < p.length; i++) {
            if (p[i] == num) {
                return i + 1;
            }
        }

        return 0;
    }

}
