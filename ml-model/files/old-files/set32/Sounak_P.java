import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] circularArrayRotation(int[] a, int k, int[] queries) {
        int result[] = new int[a.length];
        int temp[] = new int[a.length-k];
        int i;
        for(i=0;i<temp.length;i++)
        {
            temp[i] = a[i];
        }
        int index = 0;
        for(int j=i;j<a.length;j++)
        {
            result[index++] = a[j];
        }
        for(int x=0;x<temp.length;x++)
        {
            result[index++] = temp[x];
        }
        return result;
    }

}
