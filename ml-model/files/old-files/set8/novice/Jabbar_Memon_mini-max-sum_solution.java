import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        long b = in.nextLong();
        long c = in.nextLong();
        long d = in.nextLong();
        long e = in.nextLong();
        long[] array = {a,b,c,d,e};
Arrays.sort(array);
long min = 0; long max = 0;
for(int i = 0; i<4;i++){
min+=array[i];

max+= array[i+1];
}
System.out.print(min + " " + max);
       
    }
}
