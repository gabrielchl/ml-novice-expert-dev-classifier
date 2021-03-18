import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static void solve(int[] array) {
Arrays.sort(array);
long min = 0; long max = 0;
for(int i = 0; i<4;i++){
min+=array[i];

max+= array[i+1];
}
System.out.print(min + " " + max);

    }
}
