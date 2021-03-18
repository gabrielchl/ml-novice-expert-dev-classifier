import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    public static int pickingNumbers(List<Integer> a) {
    int arr[]=new int[a.size()];
    int k=0;
    for(Integer b:a){
        arr[k]=b; k++;
    }
    Arrays.sort(arr);
    int max=0;
    for(int i=0;i<arr.length-1;i++){
        int f=arr[i];
        int count=1;
        for(int j=i+1;j<arr.length;j++){
            if(arr[j]==f || arr[j]==f+1){
                count++;
            }
        }
        max=count>max?count:max;
    }
    return max;

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] aTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> a = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aTemp[i]);
            a.add(aItem);
        }

        int result = Result.pickingNumbers(a);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
