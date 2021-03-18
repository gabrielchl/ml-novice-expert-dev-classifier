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

public class Solution {

    // Complete the migratoryBirds function below.
    static int migratoryBirds(List<Integer> arr) {
            int a[]= new int[6];
            for(int i=0;i<arr.size();i++){
                a[arr.get(i)]++;
            }
            int max=a[1],id=1;
            for(int i=2;i<=5;i++){
                if(a[i]>max){
                    max=a[i];
                    id=i;
                }
            }
            return id;


    }

}
