import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int[] circularArrayRotation(int[] a,int k, int[] queries) {
        int[] result=new int[queries.length];
        int n=a.length;
        int[] temp=Arrays.copyOf(a,n);
        boolean[] status=fill(false,n);
        for(int i=0;i<n;i++){
            int location=(i+k)%n;
            if(status[i]==false){
                a[location]=a[i];
            }
            else {
               a[location]=temp[i];
            }
            status[location]=true;
        }

        for(int i=0;i<queries.length;i++){
            result[i]=a[queries[i]];
        }
        return result;

    }
    static boolean[] fill(boolean val,int size){
        boolean[] status=new boolean[size];
        for(int i=0;i<size;i++){
            status[i]=false;
        }
        return status;
    }

}
