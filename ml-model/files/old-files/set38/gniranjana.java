import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


public class Solution {

    static int[] permutationEquation(int[] p) {
       Map<Integer, Integer> permMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < p.length;i++) {
            Integer key = i+1;
            permMap.put(key, p[i]);
        }
        int[] arrRet = new int[p.length];
        int arrCount =0;
        for (int i = 1; i <= p.length;i++) {
            for(Entry entry :permMap.entrySet()) {
                Integer newVal = (Integer)entry.getValue();

                if(i == newVal.intValue()) {
//                    System.out.println("newVal: " + newVal + " newKey: " +entry.getKey());
                    Integer newKey = (Integer)entry.getKey();
//                    System.out.println("newKey:" +newKey);

                      for (Entry et1 : permMap.entrySet())
                      {
                          if(newKey == et1.getValue())
                          {
                              arrRet[arrCount] = (Integer)et1.getKey();
                              arrCount++;
//                              break;
                          }
                      }

                }
            }
        }

        return arrRet;

    }

}
