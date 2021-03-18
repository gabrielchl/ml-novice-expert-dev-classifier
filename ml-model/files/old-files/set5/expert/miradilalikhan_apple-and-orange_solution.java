import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the countApplesAndOranges function below.
    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
            int numA =0, numB=0;
            for(int ap:apples){
                if(a+ap>=s && a+ap<=t)numA++;
            }
            System.out.println(numA);
            for(int bb:oranges){
                if(b+bb>=s && b+bb<=t)numB++;
            }
            System.out.println(numB);
    }

    
}
