import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] circularArrayRotation(int[] a, int k, int[] queries) {
        int[] result=new int[queries.length];
        for(int j=0;j<k;j++)
        {int w=a[a.length-1];


        for(int i=a.length-1;i>0;i--)

        {
int temp=a[i];
 a[i]=a[i-1];
a[i-1]=temp;
        }
        a[0]=w;

        }
        for(int i=0;i<queries.length;i++)
        {
result[i]=a[queries[i]];
        }
return(result);

    }

}
