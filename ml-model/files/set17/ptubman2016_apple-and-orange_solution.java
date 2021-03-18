import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static void solve(int s, int t, int a, int b, int[] apples, int[] oranges) {

        int numApples = 0;
        int numOranges = 0;

        for(int i = 0; i < apples.length; i++){
            int posLandedApple = (a + apples[i]);
            if(posLandedApple >= s && posLandedApple <= t){
                numApples++;
            }

        }
        for(int j = 0; j < oranges.length; j++){
            int posLandedOrange = (b + oranges[j]);
            if(posLandedOrange >= s && posLandedOrange <= t){
                numOranges++;
            }

        }

        System.out.println(numApples);
        System.out.println(numOranges);



    }

}
