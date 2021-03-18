import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
        int acount=0,bcount=0;
        for(int i=0;i<apples.length;i++){
            apples[i] = apples[i] + a;
            if(apples[i] >=s  &&  apples[i] <=t ) acount++;
        }

          for(int i=0;i<oranges.length;i++){
            oranges[i] = oranges[i] + b;
            if(oranges[i] >=s && oranges[i] <=t) bcount++;
        }
        System.out.println(acount);
        System.out.println(bcount);


    }

}
