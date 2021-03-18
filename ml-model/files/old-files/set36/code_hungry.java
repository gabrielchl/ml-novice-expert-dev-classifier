import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.stream.IntStream;
public class Solution {

    static int[] permutationEquation(int[] p) {
        int returnArr[] = new int[p.length], count = 0;
        for(int i = 0; i < p.length; i++){
            int firstPlace = findIndex(p, i+1) + 1;
            returnArr[count++] = findIndex(p, firstPlace) + 1;
        }
        return returnArr;
    }
    static int findIndex(int arr[], int num){
        return IntStream.range(0, arr.length)
                .filter(x -> arr[x] == num)
                .findFirst()
                .orElse(-1);
    }
}
