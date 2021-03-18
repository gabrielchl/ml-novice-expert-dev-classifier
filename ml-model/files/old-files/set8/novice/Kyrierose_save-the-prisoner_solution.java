import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
static Scanner sc=new Scanner(System.in);
    
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t>0){
        	ajax();
        	t--;
        }
    }
    private static void ajax(){
    	int n=sc.nextInt();
    	int m=sc.nextInt();
    	int s=sc.nextInt();
    	
    	if(s+m==0)System.out.println("1");
    	else System.out.println(s+m-1);
    }
}