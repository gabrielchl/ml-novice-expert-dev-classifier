import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    static int migratoryBirds(int n, int[] arr){
        int[] counter = new int[6];
        int result = 1;
        int max = 0;
        for(int i = 0 ; i < n ; i++){
            counter[arr[i]]++;
        }
        for(int i = 1 ; i <= 5 ; i++){
            if(counter[i] > max){
                result = i;
                max = counter[i];
            }
        }
        return result;
    }
}
