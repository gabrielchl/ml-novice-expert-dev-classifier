import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {
        Map<Integer,Integer> pMap=new HashMap<>();
        int[] ansArr=new int[p.length];
        for(int i=1;i<=p.length;i++){
            pMap.put(p[i-1],i);
        }
        for(int x=1;x<=p.length;x++){
            ansArr[x-1]=pMap.get((pMap.get(x)));
        }
        return ansArr;
    }

}
