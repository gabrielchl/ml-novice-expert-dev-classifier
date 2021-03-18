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
        int x=p.length;
        int[] value=new int[x];
        for(int i=0;i<x;i++)
        {
            value[p[p[i]-1]-1]=i+1;
        }
        return value;
    }

}
