import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int solve(List<Integer> arr) {
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(final int i:arr){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }else{
                map.put(i,1);
            }
        }
        int max=0;
        int num=6;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue()>max){
                max=entry.getValue();
                num=entry.getKey();
            }

        }
        return num;


    }

}
