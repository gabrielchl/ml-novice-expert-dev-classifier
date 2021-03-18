import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void solve(int[] apple,int[] orange,int s, int t,int a, int b ){

        int manzanas, naranjas;
        manzanas  = naranjas = 0;

        for(int i=0; i<apple.length; i++){

            if((a+apple[i]) >= s && (a+apple[i])<=t){

                manzanas++;

            }

        }

        for(int i=0; i<orange.length; i++){

            if((b+orange[i]) >= s && (b+orange[i])<=t){

                naranjas++;

            }

        }

        System.out.println(manzanas);
        System.out.print(naranjas);


    }



}
