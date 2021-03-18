import java.util.*;
import java.io.*;
import java.math.*;

public class sample{
    public static void main(String []args){
    	Scanner scan=new Scanner(System.in);
    	int n=scan.nextInt();
    	long[] a=new long[n];
    	for(int i=0;i<n;i++) {
    		a[i]=scan.nextLong();
    	} 
    	long[] r=new long[n];
    	long temp=0,waste;
    	for(int i=0;i<n;i++) {
    	waste=a[i];
		if(waste>=38) {
		    for(int j=0;j>=0;j++) {
			    waste=waste+1;
		    	if(waste%5==0) {
				temp=waste;
				break;
			    }
	    	}
            if((temp-a[i])<3){
                a[i]=temp;
            }
		}
		r[i]=a[i];
    	}
    	for(int i=0;i<n;i++) {
    		System.out.println(r[i]);
    	}
    }
}
