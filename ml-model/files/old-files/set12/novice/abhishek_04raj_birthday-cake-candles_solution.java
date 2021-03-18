import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int height[] = new int[n];
        for(int height_i=0; height_i < n; height_i++){
            height[height_i] = in.nextInt();
        }
        Arrays.sort(height);
        int temp=height[n-1];
        //int blow=temp;
        int count=1;
        for(int i=n-2;i>=0;i--){
            if(height[i]==temp)
                count++;
                //blow+=height[i];
                
        }
        System.out.println(count);
    }
}
