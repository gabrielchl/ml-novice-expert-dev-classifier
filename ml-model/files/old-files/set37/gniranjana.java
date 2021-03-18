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

    // Complete the permutationEquation function below.
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

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] p = new int[n];

        String[] pItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int pItem = Integer.parseInt(pItems[i]);
            p[i] = pItem;
        }

        int[] result = permutationEquation(p);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
