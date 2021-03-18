import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] circularArrayRotation(int[] arr, int k, int[] queries) {
        for(int i =0 ; i< queries.length ; i++){
            int index = k % arr.length;
            int idx = queries[i];
            if (idx - index >= 0)
                queries[i] = arr[idx - index];
            else
                queries[i] = arr[idx - index + arr.length];
        }

        return queries;
    }

}
