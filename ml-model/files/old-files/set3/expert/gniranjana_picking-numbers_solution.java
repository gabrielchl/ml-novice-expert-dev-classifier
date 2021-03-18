import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'pickingNumbers' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static int pickingNumbers(List<Integer> a) {
    // Write your code here
        ArrayList<Integer> al = new ArrayList<>();
        Collections.sort(a);
        int firstNum = a.get(0);
        for(int i = 1; i < a.size();i++){
            int secNum = a.get(i);
            if(Math.abs(firstNum - secNum) <=1) {
                if(al.isEmpty()) 
                {
                        al.add(firstNum);
                        al.add(secNum);
                }
                else 
                {
                    int arNum = al.get(al.size()-1);
                    int arNumOne = al.get(0);
                    if(Math.abs(firstNum - arNum) <=1 && Math.abs(secNum - arNum) <=1
                            &&
                            Math.abs(firstNum - arNumOne) <=1 && Math.abs(secNum - arNumOne) <=1) {
//                        al.add(firstNum);
                        al.add(secNum);
                    }
                }
            }
            firstNum = secNum;
        }
        return al.size();
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result.pickingNumbers(a);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
