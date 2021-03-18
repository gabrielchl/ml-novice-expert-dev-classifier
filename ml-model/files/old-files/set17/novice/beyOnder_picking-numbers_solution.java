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

    public static int solve(List<Integer> a) {
        int []b=new int[100];
        for(int i=0;i<a.size();i++){
            b[a.get(i)]++;
        }
        int max=0;
        for(int j=1;j<99;j++){
            if(max<b[j]+b[j+1]){
                max=b[j]+b[j+1];
            }
        }

        return max;

    }

}
