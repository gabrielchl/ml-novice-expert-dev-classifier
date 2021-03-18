import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {
        int []a=new int[p.length];
        int r=0;

      for (int x = 0; x < p.length; x++)
        {
            for (int y = 0; y < p.length; y++)
            {
                if (p[p[y] - 1] - 1 == x)
                {
                    a[x] = y + 1;
                    break;
                }
            }
        }





          return a;
    }

}
