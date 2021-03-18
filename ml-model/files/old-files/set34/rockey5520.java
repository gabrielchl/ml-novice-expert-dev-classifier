import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] circularArrayRotation(int[] a, int k, int[] queries) {

int[] result = new int[queries.length];
    int rotated[] = new int[a.length];

    for (int i = 0; i < a.length; i++) {
      int newPosition = (i + k) % (a.length);
      rotated[newPosition] = a[i];
    }

    for (int x = 0; x < queries.length; x++) {
      result[x] = rotated[queries[x]];
    }

    return result;
    }

}
