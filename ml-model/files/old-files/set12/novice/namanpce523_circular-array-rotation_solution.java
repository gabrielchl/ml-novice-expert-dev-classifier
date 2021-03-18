import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args)throws IOException  {
        Scanner sc = new Scanner (System.in);
        
        int n = sc.nextInt();
        int k = sc.nextInt (); 
        int q =sc.nextInt();
        int arr[] = new int [n];
        int arrQ[]= new int [q];
        
        for (int i =0; i<n ; i++){
            arr[i]=sc.nextInt();
        }
        for(int i =0; i<q;i++){
            arrQ[i]=sc.nextInt();
        }
        
            for(int i =0; i<k; i++){
                int temp = arr[n];
                for(int j =n;j>0;j--){               
                    arr[j] =arr[j-1];
            }
                arr[0]=arr[n];
            }
        for(int i=0; i<q;i++){
            System.out.println(arr[arrQ[i]]);
            
        }
        
            
        }
        
  }
}