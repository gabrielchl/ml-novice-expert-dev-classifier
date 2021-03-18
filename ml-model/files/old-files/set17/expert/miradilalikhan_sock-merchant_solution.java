import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int solve(int n, int[] ar) {
        int result=0;
      HashMap<Integer, Integer> sockColor = new HashMap<Integer,Integer>();
      for(int i=0; i<ar.length; i++){
          int sockValue= (sockColor.containsKey(ar[i]))?sockColor.get(ar[i]):0;
          sockValue++;
          sockColor.put(ar[i],sockValue);
      }
      for(Map.Entry<Integer,Integer> map : sockColor.entrySet()){
          result+=(map.getValue()/2);
      }
    //   System.out.println(sockColor.get(1)/2);
    //   System.out.println(sockColor.get(2)/2);
    //   System.out.println(sockColor.get(3)/2);
    //   System.out.println(sockColor.get(5)/2);
    //   System.out.println(sockColor.get(6)/2);
return result;
    }

}
