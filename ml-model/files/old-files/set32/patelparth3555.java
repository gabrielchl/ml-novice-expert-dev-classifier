import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] circularArrayRotation(int[] a, int k, int[] queries) {
        int rotation=k%a.length;
        int[] afterRotation=new int[queries.length];
        int size=a.length;
        for(int i=0;i<queries.length;i++){
            System.out.print(queries[i]+" ");
            if(size-rotation+queries[i]>=size){
                afterRotation[i]=a[size-rotation+queries[i]-size];
            }else{
                afterRotation[i]=a[size-rotation+queries[i]];
            }

        }
        //System.out.println(1%3);
        return afterRotation;
    }

}
