import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static void solve(int s, int t, int a, int b, int[] apples, int[] oranges) {

        // apple on house
        int applesOnHouse = 0;
        for(int i=0; i < apples.length; i++){
            int applePosition = a + apples[i];
            if(applePosition >= s && applePosition <= t){
                applesOnHouse++;
            }
        }
        System.out.println(applesOnHouse);

        // orange on house
        int orangeOnHouse = 0;
        for(int i=0; i < oranges.length; i++){
            int orangePosition = b + oranges[i];
            if(orangePosition >= s && orangePosition <= t){
                orangeOnHouse++;
            }
        }
        System.out.println(orangeOnHouse);
    }

}
