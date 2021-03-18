import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {
        int[] newArr = new int[p.length];
        boolean[] flags = new boolean[p.length];

        ArrayList<Integer> lists = new ArrayList<Integer>();
        for(int x = 1; x <= p.length; x++) {
            for(int i = 0; i < p.length; i++) {
                if(p[i] == x) {
                    for(int j = 0; j < p.length; j++) {
                        if(p[j] == i + 1) {
                            newArr[x - 1] = j + 1;
                            break;
                        }
                    }
                    break;
                }
            }
        }
        return newArr;

    }

}
