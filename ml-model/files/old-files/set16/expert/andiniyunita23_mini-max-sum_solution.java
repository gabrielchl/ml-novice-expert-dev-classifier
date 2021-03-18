import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for(int arr_i=0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        
        long total1 = 0, total2 = 0, total3 = 0, total4 = 0, total5 = 0;
        for(int i=0; i<5; i++) {
            if(i!=0) {
                total1+= arr[i];
            }
            
            if(i!=1) {
                total2+= arr[i];
            }
            
            if(i!=2) {
                total3+= arr[i];
            }
            
            if(i!=3) {
                total4+= arr[i];
            }
            
            if(i!=4) {
                total5+= arr[i];
            }
        }
        
        long[] total = new long[]{total1, total2, total3, total4, total5};
        
        for(int i=0; i<5; i++) {
            for(int j=0; j<5; j++) {
                if(total[i]<total[j]) {
                    long temp = total[i];
                    total[i] = total[j];
                    total[j] = temp;
                }
            }
        }
        
        System.out.println(total[0] + " " + total[4]);
    }
}
