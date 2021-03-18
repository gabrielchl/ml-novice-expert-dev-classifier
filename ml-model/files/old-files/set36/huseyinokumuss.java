import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {
        int [] sonuc = new int[p.length];
        for(int i = 0; i< p.length;i++){
            int indis = i+1;
                for(int j =0; j<p.length; j++){
                    if(indis==p[j]){
                        sonuc[p[i]-1]= j+1;
                        break;
                    }
                }

        }
        return sonuc;


    }

}
