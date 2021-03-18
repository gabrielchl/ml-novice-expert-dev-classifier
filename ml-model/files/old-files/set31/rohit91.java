import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int[] circularArrayRotation(int[] a,int k, int[] m) {
        // Complete this function
        int[] result=new int[m.length];
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
        
        for(int i=0;i<m.length;i++){
            result[i]=a[m[i]];
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

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int q = in.nextInt();
        int[] a = new int[n];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] m = new int[q];
        for(int m_i = 0; m_i < q; m_i++){
            m[m_i] = in.nextInt();
        }
        int[] result = circularArrayRotation(a,k, m);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");


        in.close();
    }
}
