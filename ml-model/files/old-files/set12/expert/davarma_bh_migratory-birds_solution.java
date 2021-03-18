import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = input.nextInt();
        }
        int result = migratoryBirds(n,arr);
        System.out.println(result);
    }
    static int migratoryBirds(int n, int[] arr){
        int[] counter = new int[6];
        int result = 1;
        int max = 0;
        for(int i = 0 ; i < n ; i++){
            counter[arr[i]]++;
        }
        for(int i = 1 ; i <= 5 ; i++){
            if(counter[i] > max){
                result = i;
                max = counter[i];
            }
        }
        return result;
    }
}
