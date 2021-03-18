import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void rot(int[] temp,int order,int query[]){
	
		for (int i = 0; i < order; i++) {
			for (int j = temp.length - 1; j > 0; j--) {
				int temp1 = temp[j];
				temp[j] = temp[j - 1];
				temp[j - 1] = temp1;
			}
		}
        for(int i=0;i<query.length;i++){
            int a=query[i];
            System.out.println(temp[a]);
    
        }
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int order=sc.nextInt();
        int q=sc.nextInt();
        int[] test=new int[n];
        int[] quer=new int[q];
        for(int i=0;i<n;i++)test[i]=sc.nextInt();
        for(int i=0;i<q;i++)quer[i]=sc.nextInt();
        rot(test,order,quer);
    
    }
}