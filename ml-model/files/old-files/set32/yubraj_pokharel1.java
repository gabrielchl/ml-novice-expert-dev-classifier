import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] circularArrayRotation(int[] a, int k, int[] queries) {
            int resultLenght = queries.length;
            int[] response = new int[resultLenght];

            int[] rotatedArray = new int[a.length];

            for(int i = 0; i <= a.length -1; i ++){
                rotatedArray[( i + k) % a.length] = a[i];
            }

            for(int y = 0; y < queries.length; y++){
                response[y] = rotatedArray[queries[y]];
            }

            return response;
    }

}
