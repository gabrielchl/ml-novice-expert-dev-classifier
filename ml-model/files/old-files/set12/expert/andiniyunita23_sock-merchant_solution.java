import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c[] = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        
        Map<Integer, Integer> stockMap = new HashMap<>();
        
        for(int i=0; i<n; i++) {
            if(stockMap.containsKey(c[i])) {
                int stock = stockMap.get(c[i]);
                stockMap.put(c[i], stock+1);
            }else{
                stockMap.put(c[i], 1);
            }
        }
        
        int totalPair = 0;
        for(Integer key : stockMap.keySet()) {
            totalPair += stockMap.get(key)/2;
        }
        
        System.out.print(totalPair);
    }
}
