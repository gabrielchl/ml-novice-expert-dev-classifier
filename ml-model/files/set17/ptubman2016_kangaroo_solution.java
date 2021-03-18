import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static String solve(int x1, int v1, int x2, int v2) {

        int lowerStarter, higherStarter, lowersVelocity, highersVelocity;

        if(x1 > x2){
            lowerStarter = x2;
            lowersVelocity = v2;
            higherStarter = x1;
            highersVelocity = v1;
        }
        else{
            lowerStarter = x1;
            lowersVelocity = v1;
            higherStarter = x2;
            highersVelocity = v2;
        }

        if(lowersVelocity > highersVelocity){

            while(lowerStarter < higherStarter){

                lowerStarter += lowersVelocity;
                higherStarter += highersVelocity;

                if(lowerStarter == higherStarter){
                    return "YES";
                }


            }

        }

        return "NO";

    }

}
