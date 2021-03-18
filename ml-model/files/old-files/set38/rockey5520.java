import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {
    final int[] indexes = new int[p.length];
    for (int i = 0; i < indexes.length; i++) {
      indexes[p[i] - 1] = i;
    }
    final int[] result = new int[p.length];
    for (int i = 0; i < result.length; i++) {
      result[i] = indexes[indexes[i]] + 1;
    }
    return result;

    }

}
