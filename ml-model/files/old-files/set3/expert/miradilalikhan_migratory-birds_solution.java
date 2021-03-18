import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the migratoryBirds function below.
    static int migratoryBirds(List<Integer> arr) {
        int higest =0;
        HashMap<Integer,Integer> h = new HashMap<Integer,Integer>();
       int[] resultArray =new int[0];
        for(int a:arr){
            int value =0;
            if(h.containsKey(a)) value = h.get(a);
            value++;
            if(higest==value){
                int[] newArray = new int[resultArray.length+1];
                for(int i=0; i<resultArray.length; i++)
                    newArray[i]=resultArray[i];
                newArray[newArray.length-1]=a;
                resultArray= newArray;
            }
            if(higest<value){
                higest=value;
                resultArray = new int[]{a};
                }
            h.put(a,value);
        }
        Arrays.sort(resultArray);
        return resultArray[0];

    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arrItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < arrCount; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr.add(arrItem);
        }

        int result = migratoryBirds(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
