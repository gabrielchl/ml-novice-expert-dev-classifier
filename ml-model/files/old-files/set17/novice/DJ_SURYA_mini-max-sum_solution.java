import java.util.*;
import java.io.*;
import java.math.*;

public class sample{
    static void solve(long[] a){
    	long temp;
    	long[] b=new long[5];
    	b[0]=a[0]+a[1]+a[2]+a[3];
    	b[1]=a[0]+a[1]+a[2]+a[4];
    	b[2]=a[0]+a[2]+a[3]+a[4];
    	b[3]=a[4]+a[1]+a[2]+a[3];
    	b[4]=a[0]+a[1]+a[4]+a[3];
    	for(int i=0;i<5;i++) {
    		for(int j=i+1;j<5;j++) {
    			if(b[i]<b[j]) {
    				temp=b[i];
    				b[i]=b[j];
    				b[j]=temp;
    			}
    		}
    	}
    	System.out.println(b[4]+" "+b[0]);
    }
}
