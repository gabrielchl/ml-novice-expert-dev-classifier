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

        for ( int j = 1; j < p.length+1; j++ )
        {

            for ( int i = 1; i < p.length+1; i++ )
            {
                if ( p[p[i-1]-1] == j )
                {
                    result[j-1] = i;
                    break;
                }
            }

        }

        return result;
    }

}
