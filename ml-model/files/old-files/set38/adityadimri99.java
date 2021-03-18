import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p)
    {
        int temp= 0;
        int arr[][] = new int[p.length][2];
        for( int i = 0 ; i < p.length ; i++)
        {
            arr[i][1] = i+1;
            arr[i][0] = p[i];
        }
        for( int i = 0 ; i < p.length ; i++)
        {
            System.out.print(arr[i][1] +" ");
            System.out.println(arr[i][0] );
        }
        Arrays.sort(p);
        for( int i = 0 ; i < p.length ; i++)
        {   temp =0;
            //System.out.println(p[i]);
            for( int j = 0 ; j < p.length ; j++)
            {
                if( p[i] == arr[j][0] )
                {
                    temp = arr[j][1];
                    System.out.println(arr[j][1]);
                }
            }
            p[i] = temp;
            //System.out.println(temp);
        }
        for( int i = 0 ; i < p.length ; i++)
        {   temp =0;
            //System.out.println(p[i]);
            for( int j = 0 ; j < p.length ; j++)
            {
                if( p[i] == arr[j][0] )
                {
                    temp = arr[j][1];
                    System.out.println(arr[j][0]);
                }
            }
            p[i] = temp;
            //System.out.println(temp);
        }

        return p;



    }

}
