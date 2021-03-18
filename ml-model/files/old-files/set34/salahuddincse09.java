import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] circularArrayRotation(int[] a, int k, int[] queries) {
         LinkedList<Integer> listForRotation = new LinkedList<>();

        for(int currentInt : a)
            listForRotation.add(currentInt);

        for(int i=0; i<k;i++ )
            listForRotation.push(listForRotation.pollLast());

        for(int i=0; i < queries.length; i++){
            if (queries[i] < listForRotation.size())
              queries[i] = listForRotation.get(queries[i]);
        }
        return queries;
    }

}
