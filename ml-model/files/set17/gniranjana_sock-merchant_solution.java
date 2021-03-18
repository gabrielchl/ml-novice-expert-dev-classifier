import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int solve(int n, int[] ar) {
           int sockPairs = 0;
        if (n <=0 ) return sockPairs;

        HashMap<Integer, Integer> arrMap = new HashMap<Integer, Integer>();
        for (int i = 0 ; i < ar.length ; i++){
            if(arrMap.get(ar[i]) == null){
                Integer sockCount = 0;
                arrMap.put(ar[i],++sockCount);
            }
            else if (arrMap.get(ar[i]) == 1){
                arrMap.put(ar[i],null);
                sockPairs++;
            }
            else if (arrMap.get(ar[i]) == 2){
                sockPairs++;
                Integer sockCount = arrMap.get(ar[i]);
                arrMap.put(ar[i],sockCount-2+1);
            }
        }
        return sockPairs;

    }

}
