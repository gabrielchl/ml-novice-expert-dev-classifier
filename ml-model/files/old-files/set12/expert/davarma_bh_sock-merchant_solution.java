import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        HashMap inv = new HashMap<Integer,Integer>();
        int matchPairs = 0;
        for(int i = 0 ; i < n ; i++){
            int color = input.nextInt();
            if(inv.containsKey(color) && inv.get(color).equals(new Integer(1))){
                inv.put(color,0);
                matchPairs++;
                continue;
            }
            inv.put(color,1);
        }
        System.out.println(matchPairs);
    }
}
