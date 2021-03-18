import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {

        int len = p.length;
        int result[] = new int[len];
        for(int i=0;i<len;i++)
        {
            for(int j=0;j<len;j++)
            {
                if(i+1 == p[p[j]-1])
                {
                    result[i] = j+1;
                    break;
                }

            }
        }
        return result;


    }

}
