import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int solve(int[] ar)
    {
int max=0,c=0;
for(int i=0;i<ar.length;i++)
{
    if(ar[i]>max) max=ar[i];

}
        for (int i = 0; i < ar.length; i++) {
            if (max==ar[i])
                c++;

        }
        return c;


    }

}
