import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class sample{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++) {
        	a[i]=scan.nextInt();
        }
        int max;
        int b=0;
        int temp=0;
        for(int i=1;i<n;i++) {
        	if(a[0]<a[i]) {
        		max=a[0];
        		a[0]=a[i];
        		a[i]=max;
        	}
        }
        for(int i=1;i<a[0];i++) {
        	int[] array=new int[n];
        	for(int j=0;j<n;j++){
        		if(i==a[j] || (i+1)==a[j]) {
        			array[b]=a[j];;
        			b=b+1;
        		}
        	}
        	if(temp<b) {
        		temp=b;
        	}
        	b=0;
        }
        System.out.println(temp);
    }
}
