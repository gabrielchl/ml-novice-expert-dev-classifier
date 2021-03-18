import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int biggest = 0;
        int freq = 0;
        for(int i=0;i<n;i++){
            int height = input.nextInt();
            if(height > biggest){
                biggest = height;
                freq = 1;
            }
            else if(height == biggest){
                freq++;
            }
        }
        System.out.println(freq);
    }
}
