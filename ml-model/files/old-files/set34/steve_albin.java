import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] circularArrayRotation(int[] a, int k, int[] queries) {

        int[] answers = new int[queries.length];

        if(k>= queries.length){
            k = k % a.length;
        }

        int indexTranslation = a.length - k;

        for(int i=0;i<queries.length;++i){
            // what is the rotated index?
            int rotatedIndex = (queries[i] + indexTranslation) % a.length;
            //System.out.println(String.format("q:%d r:%d i:%d", queries[i], indexTranslation, rotatedIndex));
            answers[i] = a[rotatedIndex];
        }

        return answers;
    }

}
