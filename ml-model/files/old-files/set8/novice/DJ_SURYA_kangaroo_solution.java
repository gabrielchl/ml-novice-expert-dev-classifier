import java.util.*;
import java.io.*;
import java.math.*;

public class sample{
    public static void main(String []args){
    	Scanner scan=new Scanner(System.in);
    	long x1=scan.nextLong();
    	long v1=scan.nextLong();
    	long x2=scan.nextLong();
    	long v2=scan.nextLong();
    	long x1p=x1+v1;
    	long x2p=x2+v2;
    	long count=0;
    	for(short i=1;i>=1;i++) {
    		x1p=x1p+v1;
    		x2p=x2p+v2;
    		if(x1p==x2p) {
    			System.out.println("YES");
    			break;
    		}
    		else {
    		 	count++;
    		}
    	}
    	if(count==(32767)) {
    		System.out.println("NO");
    	}
    }
}
