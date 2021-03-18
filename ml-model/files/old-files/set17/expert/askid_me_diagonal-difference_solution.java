import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


public class Solution {

    public static int solve(List<List<Integer>> arr) {
    int x =0;
        int y =0;
        List<Integer> row = new ArrayList();
        for(int i = 0; i < arr.size(); i++){
            row = arr.get(i);
            for(int j = 0; j <row.size(); j++ ){
                x += row.get(j+i);
                y += row.get(row.size()-i-1);
                break;
            }

        }
        return Math.abs(x-y);
    }

}
