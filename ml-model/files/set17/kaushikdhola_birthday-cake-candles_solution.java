import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    static Scanner scanner = new Scanner(System.in);
    static int solve(int[] a) {


int high=0;
int count=0;
    high=a[0];
    for(int i=0;i<a.length;i++)
    {

            if(high < a[i])
            {
                high=a[i];

            }



    }

   for(int i=0;i<a.length;i++)
    {

            if(high == a[i])
            {
                count=count+1;
            }

    }

        System.out.print(count);
        count=0;


    }
}
