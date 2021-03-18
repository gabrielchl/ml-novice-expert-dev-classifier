import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] types = new int[n];
        for(int types_i=0; types_i < n; types_i++){
            types[types_i] = in.nextInt();
        }
        // your code goes here
       
        Map<Integer, Integer> totalMap = new HashMap<>();
        for(int i=0; i<n; i++) {
            if(totalMap.containsKey(types[i])) {
                int currentTotal = totalMap.get(types[i]);
                totalMap.put(types[i], currentTotal+1);
            }else {
                totalMap.put(types[i], 1);
            }
        }
        
        int highestTotal = 0;
        int mostTypeId = -1;
        for(Integer key: totalMap.keySet()) {
            if(totalMap.get(key) > highestTotal) {
                highestTotal = totalMap.get(key);
                mostTypeId = key;
            }else if (totalMap.get(key) == highestTotal) {
                if(key<mostTypeId) {
                    mostTypeId = key;
                }
            }
        }
        
        
        System.out.println(mostTypeId);
    }
}
